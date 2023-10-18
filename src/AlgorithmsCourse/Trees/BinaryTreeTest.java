package AlgorithmsCourse.Trees;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void orders(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.left.right.left = new Node(8);

        System.out.print("InOrder: ");
        BinaryTree.inOrder(root);
        System.out.println();
        System.out.print("PreOrder: ");
        BinaryTree.preOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        BinaryTree.postOrder(root);
    }
    @Test
    public void invertedTree(){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        System.out.print("InOrder: ");
        BinaryTree.inOrder(root);
        root = BinaryTree.invertBinaryTree(root);
        System.out.print("Inverted: ");
        BinaryTree.inOrder(root);

    }
    @Test
    public void listOfDepths(){
        /**
         *       4
         *     2    7
         *   1  3  6  9
         */
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        var result = BinaryTree.listOfDepths(root);

        BinaryTree.breadthTraversal(root);

        assertEquals(3, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(2, result.get(1).size());
        assertEquals(4, result.get(2).size());
    }

    @Test
    public void maxDepth(){
        /**
         *       4
         *     2    7
         *   1  3  6  9
         *             10
         */
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        root.right.right.right = new Node(10);

        assertEquals(4,BinaryTree.maxDepth(root));
    }

    @Test
    public void isSubTree(){
        /**
         *       4
         *     5   7
         *   1  3
         *  8
         */
        Node tree1 = new Node(4);
        tree1.left = new Node(5);
        tree1.right = new Node(7);
        tree1.left.left = new Node(1);
        tree1.left.right = new Node(3);
        tree1.left.left.left = new Node(8);
        /**
         *       5
         *     1   3
         *   8
         */
        Node tree2 = new Node(5);
        tree2.left = new Node(1);
        tree2.right = new Node(3);
        tree2.left.left = new Node(8);

        assertTrue(BinaryTree.isSubTree(tree1,tree2));
        assertTrue(BinaryTree.isSubTree(tree1,new Node(7)));
        assertFalse(BinaryTree.isSubTree(tree1,new Node(5)));
    }

    @Test
    public void firstCommonAncestor(){
        /**
         *       4
         *     5   7
         *   1  3
         *  8
         */
        Node tree1 = new Node(4);
        tree1.left = new Node(5);
        tree1.right = new Node(7);
        tree1.left.left = new Node(1);
        tree1.left.right = new Node(3);
        tree1.left.left.left = new Node(8);

        assertEquals(5,BinaryTree.firstCommonAncestor(
                tree1,
                tree1.left.left,
                tree1.left.right
        ).value);

        assertEquals(4 ,BinaryTree.firstCommonAncestor(
                tree1,
                tree1.left.left,
                tree1.right
        ).value);
    }


}
