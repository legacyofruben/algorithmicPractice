package AlgorithmsCourse.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeTest {
    LinkedList list;
    @BeforeEach
    public void setup(){
        list = new LinkedList();
    }
    @Test
    public void mergeTwoLists(){
        LinkedList list1 = new LinkedList();
        list1.appendToTail(1);
        list1.appendToTail(2);
        list1.appendToTail(3);
        list1.appendToTail(4);
        LinkedList list2 = new LinkedList();
        list2.appendToTail(1);
        list2.appendToTail(2);
        list2.appendToTail(5);
        list2.appendToTail(7);
        list2.appendToTail(8);
        list1.mergeTwoLists(list1,list2).print();
    }

}
