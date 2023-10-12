package AlgorithmsCourse.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackMinTest {

    @Test
    public void getMin() throws Exception {
        StackMin stack = new StackMin();
        stack.push(5);
        stack.push(2);
        stack.push(16);
        stack.push(6);
        stack.push(2);
        stack.push(1);
        assertEquals(1,stack.min());
        stack.pop();
        assertEquals(2,stack.min());
    }
}
