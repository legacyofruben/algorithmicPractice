package LeetCode.PalindromicSubstring;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstring {
    private static final Logger logger = Logger.getLogger(PalindromicSubstring.class.getName());
    /***
     * 5. Longest Palindromic Substring
     *
     * Given a string s, return the longest
     * palindromic substring in s.
     *
     * Example 1:
     *
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     *
     * Input: s = "cbbd"
     * Output: "bb"
     */

    public static boolean isPalindromic(String s){
        int len = s.length()-1;
        for (int i = 0; i < s.length()/2; i++, len--) {
            if(s.charAt(i)!=s.charAt(len)){
                return false;
            }
        }
        return true;
    }
    public static String longestPalindromic (String s){
        // aacabdkacaa
        String longest = "";
        int len = s.length();
        int l=0;
        int r=1;
        while(l <= len){
            logger.info(s.substring(l,r));
            if((len-l) >= longest.length()){
                if ((s.substring(l,r).length() > longest.length()) &&
                        isPalindromic(s.substring(l,r))) {
                    longest = s.substring(l,r);
                }
            }else{
                break;
            }
            if(r <= len-1){
                r++;
            }else{
                l++;
                r=l+1;
            }
        }
        return longest;
    }

}
class PalindromicSubstringTest{
    @Test
    public void longestPalindromicTest1(){
        assertEquals("bab",PalindromicSubstring.longestPalindromic("babad"));
    }
    @Test
    public void longestPalindromicTest2(){
        assertEquals("bb",PalindromicSubstring.longestPalindromic("cbbd"));
    }
    @Test
    public void longestPalindromicTest3(){
        assertEquals("abcsuguscba",PalindromicSubstring.longestPalindromic("abcsuguscba"));
    }
    @Test
    public void longestPalindromicTest4(){
        assertEquals("sugus",PalindromicSubstring.longestPalindromic("abzsuguscza"));
    }
    @Test
    public void longestPalindromicTest5(){
        assertEquals("a",PalindromicSubstring.longestPalindromic("ac"));
    }

    @Test
    public void longestPalindromicTest6(){
        assertEquals("aca",PalindromicSubstring.longestPalindromic("aacabdkacaa"));
    }

}
