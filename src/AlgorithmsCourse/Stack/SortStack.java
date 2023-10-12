package AlgorithmsCourse.Stack;

import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sort(Stack<Integer> stack){
        if(stack.isEmpty()) return null;
        Stack<Integer> stackSorted = new Stack<>();
        while(!stack.isEmpty()){
            int element = stack.pop();
            while(!stackSorted.isEmpty() && element > stackSorted.peek()){
                stack.push(stackSorted.pop());
            }
            stackSorted.push(element);
        }

        return stackSorted;
    }
}
