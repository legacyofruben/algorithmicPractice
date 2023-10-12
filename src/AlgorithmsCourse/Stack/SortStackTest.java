package AlgorithmsCourse.Stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortStackTest {
    @Test
    public void sort(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.push(3);
        stack.push(4);

        assertEquals(1,SortStack.sort(stack).pop());

    }
}
