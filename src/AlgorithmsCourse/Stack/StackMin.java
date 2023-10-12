package AlgorithmsCourse.Stack;

import java.util.Stack;

public class StackMin {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();


    public void push(int input){
        stack.push(input);
        if(min.isEmpty()){
            min.push(input);
        }else{
            if(input <= min.peek()){
                min.push(input);
            }
        }
    }

    public int pop() throws Exception {
        if(stack.isEmpty()){
            throw new Exception("Stack empty");
        }
        int element = stack.pop();
        if(element <= min.peek()){
            min.pop();
        }
        return element;
    }

    public int min (){
        return min.peek();
    }

}
