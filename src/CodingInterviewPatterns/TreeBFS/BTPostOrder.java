package CodingInterviewPatterns.TreeBFS;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val
                =
                val;
        this.left = left;
        this.right = right;
    }
}
public class BTPostOrder {
    /**
     * @Link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
     */
    public static List<Integer> portOrderTraversal(TreeNode root){
        if(root == null) return List.of();
        if (root.left == null && root.right == null) return List.of(root.val);
        List<Integer> list = new ArrayList<>();
        portOrder(root,list);
        return list;
    }

    private static void portOrder(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        portOrder(root.left, list);
        portOrder(root.right, list);
        list.add(root.val);
    }
}

class BTPostOrderTest{
    @Test
    public void portOrderTraversalTest_1(){
        TreeNode input = new TreeNode(1);
        input.left = null;
        input.right = new TreeNode(2);
        input.right.left = new TreeNode(3);
        assertEquals(List.of(3,2,1), BTPostOrder.portOrderTraversal(input));

    }
    @Test
    public void portOrderTraversalTest_2(){
        TreeNode input = null;
        assertEquals(List.of(), BTPostOrder.portOrderTraversal(input));

    }
    @Test
    public void portOrderTraversalTest_3(){
        TreeNode input = new TreeNode(1);
        assertEquals(List.of(1), BTPostOrder.portOrderTraversal(input));

    }

}
