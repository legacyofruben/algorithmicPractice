package AlgorithmsCourse.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
