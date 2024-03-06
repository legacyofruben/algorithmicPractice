package CodingInterviewPatterns.MergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next = null;
    }
}
public class LinkedListCycle {
    /**
     * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     *
     * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
     * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
     * Return true if there is a cycle in the linked list. Otherwise, return false.

     * Example 1:
     * |3|->|2|->|0|->|-4|
     *       |__________|
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
     *
     * @Link: https://leetcode.com/problems/linked-list-cycle/description/?envType=daily-question&envId=2024-03-06
     */
    public static boolean hasCycle(ListNode head){
        if(head==null || head.next ==null) return false;

        //Set<Integer> visited = new HashSet<>();
        while (head!=null){
            if(head.val != Integer.MIN_VALUE){
                head.val = Integer.MIN_VALUE;
                head = head.next;
            }else{
                return true;
            }
        }
        return false;
    }

}
class LinkedListCycleTest{
    @Test
    public void hasCycleTest(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        assertTrue(LinkedListCycle.hasCycle(head));
    }
}