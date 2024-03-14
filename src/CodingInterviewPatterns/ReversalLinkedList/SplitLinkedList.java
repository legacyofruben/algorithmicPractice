package CodingInterviewPatterns.ReversalLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @link: https://leetcode.com/problems/split-linked-list-in-parts/description/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SplitLinkedList {

    /**
     * 13 5
     * d = 2
     * m = 3
     * 1,2,3 | 4,5,6 | 7,8,9 | 10,11 | 12,15
     */

    public static int getLength(ListNode head){
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static ListNode[] splitLinkedListToParts(ListNode head, int k){
        //  base case
        if(head==null && k==0) return null;
        if(head==null && k!=0) {
            return new ListNode[k];
        }
        // get length
        int len = getLength(head);
        int div =  len / k;
        int mod = len % k;
        if(div==0 && mod != 0){
            div=1;
            mod=0;
        }

        ListNode[] result = new ListNode[k];
        int index = 0;
        ListNode cur = head;
        ListNode tail = null;
        while(cur != null){
            ListNode section = cur;
            int i =0 ;
            int limit = mod > 0 ? div+1 : div;
            while(i++ < (limit)){
                //System.out.print(cur.val+" ");
                if(i < (limit))
                    cur = cur.next;
            }
            //System.out.print("| ");
            tail = cur.next;
            cur.next = null;
            result[index++] = section;
            cur = tail;
            mod--;
        }
        return result;
    }
}

class SplitLinkedListTest {
    @Test
    public void splitLinkedListToPartsTest() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(6);
        input.next.next.next.next.next.next = new ListNode(7);
        input.next.next.next.next.next.next.next = new ListNode(8);
        input.next.next.next.next.next.next.next.next = new ListNode(9);
        input.next.next.next.next.next.next.next.next.next = new ListNode(10);

        assertEquals(3,SplitLinkedList.splitLinkedListToParts(input,3));
    }
}


