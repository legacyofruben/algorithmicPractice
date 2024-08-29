package ProjectEuler.LargestPalindromeProduct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LargestPalindromeProductTest{
    @Test
    public void test_01(){
        assertEquals(906609,
                LargestPalindromeProduct.solution());
    }
    @Test
    public void test_isPalindrome(){
        assertTrue(LargestPalindromeProduct.isPalindrome("101"));
        assertTrue(LargestPalindromeProduct.isPalindrome("101101"));
    }

}
