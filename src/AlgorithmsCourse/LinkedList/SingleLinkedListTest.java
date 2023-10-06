package AlgorithmsCourse.LinkedList;

import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {
    SingleLinkedList list = new SingleLinkedList();
    @Test
    public void SingleLinkedList(){
        SingleLinkedList list = new SingleLinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.print();
    }
    @Test
    public void deleteHead(){
        SingleLinkedList list = new SingleLinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.deleteNode(1);
        list.print();
    }
    @Test
    public void deleteTail(){
        SingleLinkedList list = new SingleLinkedList();
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
}
