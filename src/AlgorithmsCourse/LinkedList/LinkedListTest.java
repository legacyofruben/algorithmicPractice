package AlgorithmsCourse.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    LinkedList list;
    @BeforeEach
    public void setup(){
        list = new LinkedList();
    }
    @Test
    public void SingleLinkedList(){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.print();
    }
    @Test
    public void deleteHead(){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.deleteNode(1);
        list.print();
    }
    @Test
    public void deleteTail(){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.deleteNode(3);
        list.print();
    }
    @Test
    public void removeDuplicates(){
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(1);
        list.print();
        list.removeDuplicates();
        list.print();
    }
    @Test
    public void removeDuplicatesNoExtraMemory(){
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(1);
        list.print();
        list.removeDuplicateNoExtraMemory();
        list.print();
    }
    @Test
    public void mergeTwoLists(){
        LinkedList list2 = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(6);

        list2.appendToTail(2);
        list2.appendToTail(3);
        list2.appendToTail(5);

        Node list3 = LinkedList.mergeTwoLists(list.head,list2.head);
    }
    @Test
    public void nthNodeToLast(){
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(6);
        Node n = LinkedList.nthNodeToLast(list.head,2);
        assertEquals(4,n.value);
    }
    @Test
    public void addTwoNumbers(){
        LinkedList list2 = new LinkedList();

        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(6);

        list2.appendToTail(5);
        list2.appendToTail(2);
        list2.appendToTail(8);

        Node list3 = LinkedList.addTwoNumbers(list.head,list2.head);

        assertEquals(6,list3.value);

    }
    @Test
    public void swapNodesInPairs(){

        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(6);
        list.appendToTail(8);

        Node list3 = LinkedList.swapNodesInPairsNewList(list.head);
        //Node list3 = LinkedList.swapNodesInPairs(list.head);

        assertEquals(2,list3.value);

    }
}
