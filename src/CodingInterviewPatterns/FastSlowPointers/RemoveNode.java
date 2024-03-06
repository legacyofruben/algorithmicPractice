package CodingInterviewPatterns.FastSlowPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next = next;
    }
}
public class RemoveNode {
    /**
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     * Example 1:
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     *
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
     */
    public static ListNode removeNthFromEnd(ListNode head, int n){
        // base case
        if(head==null) return null;
        if(n==0) return head.next;

        ListNode ref = head;
        ListNode curr = ref;
        ListNode point = curr;
        for (int i = 0; i < n ;i++) {
            point = point.next;
        }
        if(point == null) return head;
        while(curr!=null){
            if (point.next == null) {
                curr.next = point;
                break;
            }else{
                curr = curr.next;
                point = point.next;
            }
        }
        return ref;
    }
}

class RemoveNodeTest{
    ListNode list;
    @BeforeEach
    public void setup(){
        list = new ListNode();
    }
    @Test
    public void removeNthFromEndTest(){
        list = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        assertEquals(5,
                RemoveNode.removeNthFromEnd(list,2).next.next.next.val);
        list = new ListNode(1);
        assertEquals(1,
                RemoveNode.removeNthFromEnd(list,1).val);
        list = new ListNode(1, new ListNode(2));
        assertEquals(1,
                RemoveNode.removeNthFromEnd(list,1).val);
    }
}
