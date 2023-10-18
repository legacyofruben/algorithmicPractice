package AlgorithmsCourse.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTree {
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value + "\t");
            inOrder(root.right);
        }
    }

    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.value + "\t");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + "\t");
        }
    }

    // Recorrido en amplitud
    public static void breadthTraversal(Node root){
        if(root == null) return;
        LinkedList<Node> tail = new LinkedList<>();
        tail.add(root);
        Node current;
        while(!tail.isEmpty()){
            current = tail.poll();
            System.out.print(current.value + "\t");
            if(current.left != null){
                tail.add(current.left);
            }
            if(current.right != null){
                tail.add(current.right);
            }
        }

    }

    public static Node invertBinaryTree(Node root){
        if(root==null) return null;
        Node tmp = root.left;
        root.left = invertBinaryTree(root.right);
        root.right = invertBinaryTree(tmp);

        return root;
    }

    public static List<LinkedList<Node>> listOfDepths(Node root){
        List<LinkedList<Node>> result = new LinkedList<>();
        LinkedList<Node> current = new LinkedList<>();
        current.add(root);

        while(!current.isEmpty()){
            result.add(current);
            LinkedList<Node> parents = current;
            current = new LinkedList<>();

            for (Node n:parents) {
                if(n.left!=null){
                    current.add(n.left);
                }
                if(n.right!=null){
                    current.add(n.right);
                }
            }
        }

        return result;
    }

    public static int maxDepth(Node root){
        if(root == null) return 0;
        int depthLeft = maxDepth(root.left) + 1;
        int depthRight = maxDepth(root.right) + 1;

        return Math.max(depthLeft,depthRight);
    }

    public static boolean isSubTree(Node tree1, Node tree2){
        StringBuilder strb1 = new StringBuilder();
        StringBuilder strb2 = new StringBuilder();
        preOrderStr(tree1,strb1);
        preOrderStr(tree2,strb2);
        return strb1.toString().contains(strb2) ? true : false;
    }
    public static void preOrderStr(Node root, StringBuilder strb){
        if(root == null) {
            strb.append("NULL");
            return;
        }
        strb.append(root.value);
        preOrderStr(root.left,strb);
        preOrderStr(root.right,strb);

    }

    static class AncestorNode{
        boolean nodeFound;
        Node ancestor;
    }

    public static Node firstCommonAncestor(Node root, Node firstNode, Node secondNode){
        return BinaryTree.postOrderSearch(root,firstNode,secondNode).ancestor;
    }

    public static AncestorNode postOrderSearch(Node root, Node firstNode, Node secondNode){
        if(root == null){
            return new AncestorNode();
        }
        AncestorNode leftResult = postOrderSearch(root.left,firstNode,secondNode);
        if(leftResult.ancestor != null) return leftResult;

        AncestorNode rightResult = postOrderSearch(root.right,firstNode,secondNode);
        if(rightResult.ancestor != null) return rightResult;

        AncestorNode result = new AncestorNode();

        if(leftResult.nodeFound && rightResult.nodeFound){
            result.ancestor = root;
            return result;
        }
        result.nodeFound =
                root == firstNode ||
                root == secondNode ||
                        leftResult.nodeFound ||
                        rightResult.nodeFound;

        return result;
    }


}
