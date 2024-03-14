package HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}
public class InsertingNodeSortedDoublyLinkedList {
    public DoublyLinkedListNode solution(DoublyLinkedListNode llist, int data){
        if(llist == null) return new DoublyLinkedListNode(data);

        DoublyLinkedListNode c = llist;
        DoublyLinkedListNode tail;
        while(c != null){
            System.out.print(c.data + "->");
            if(c.data <= data){
                if(c.next != null && c.next.data > data){
                    tail = c.next;
                    c.next = new DoublyLinkedListNode(data);
                    System.out.print(data + "->");
                    c.next.next = tail;
                    c.next.prev = c;
                    break;
                }else{
                    if(c.next == null){
                        tail = c;
                        c.next = new DoublyLinkedListNode(data);
                        c.next.prev = tail;
                        break;
                    }
                    c = c.next;
                }
            }else{
                tail = c;
                c = new DoublyLinkedListNode(data);
                tail.prev = c;
                c.next = tail;
                llist = c;
                break;
            }
        }

        return llist;
    }
}
class InsertingNodeSortedDoublyLinkedListTest{
    @Test
    public void solutionTest(){
        InsertingNodeSortedDoublyLinkedList in = new InsertingNodeSortedDoublyLinkedList();
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertNode(1);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(10);
        assertEquals(5,in.solution(list.head,5).next.next.next.data);
    }
    @Test
    public void solutionTest2(){
        InsertingNodeSortedDoublyLinkedList in = new InsertingNodeSortedDoublyLinkedList();
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        assertEquals(1,in.solution(list.head,1).data);
    }
    @Test
    public void solutionTest3(){
        InsertingNodeSortedDoublyLinkedList in = new InsertingNodeSortedDoublyLinkedList();
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        assertEquals(4,in.solution(list.head,4).next.next.next.data);
    }

}