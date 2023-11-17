package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static LeetCode.example1.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Input: s = "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 * Example 2:
 *
 * Input: s = "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 * Example 3:
 *
 * Input: s = "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 */

public class example1 {
    public static String solution(String s) throws Exception {
        Stack<Character> pila = new Stack<>();
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char c: s.toCharArray()) {
            builder.append(c);
            if(c == '('){
                pila.push(c);
            }else{
                if(pila.peek() == '('){
                    pila.pop();
                }else{
                    throw new Exception("Error");
                }
            }
            if(pila.isEmpty()){
                builder.deleteCharAt(0);
                builder.deleteCharAt(builder.length()-1);
                result.append(builder);
                builder.delete(0,builder.length());
            }
        }
        return result.toString();
    }
}

class example1Test{
    @Test
    public void exampleTest() throws Exception {
        assertEquals("()()()",solution("(()())(())"));
        assertEquals("()()()()(())",solution("(()())(())(()(()))"));
        assertEquals("",solution("()()"));
    }
}