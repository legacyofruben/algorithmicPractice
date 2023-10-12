package AlgorithmsCourse.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisTest {
    @Test
    public void isValid(){
        assertTrue(ValidParenthesis.isValid("([{}])"));
        assertTrue(ValidParenthesis.isValid("()[{}]"));
        assertFalse(ValidParenthesis.isValid("(()"));
    }
}
