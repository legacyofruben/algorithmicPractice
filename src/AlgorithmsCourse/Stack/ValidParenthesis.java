package AlgorithmsCourse.Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        /**
         * Write a function that processes a matrix to detect '0'.
         * Once you detect a 0 in a cell, change the values of
         * the row and column where it is located.
         *
         * input: 2 5 6 0 9
         *        4 7 8 6 2
         *        1 0 7 8 4
         *        5 9 8 4 6
         *        2 8 5 9 7
         *
         * output: 0 0 0 0 0
         *         4 0 8 0 2
         *         0 0 0 0 0
         *         5 0 8 0 6
         *         2 0 5 0 7
         */
    }

    public static boolean isValid(String input){
        if(input==null || input.isBlank() || input.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();
        char getIt = 0;

        for (char c: input.toCharArray()) {
            switch (c){
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.pop() != '('){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.pop() != '['){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.pop() != '{'){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
