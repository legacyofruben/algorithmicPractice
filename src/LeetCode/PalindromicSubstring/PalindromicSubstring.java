package LeetCode.PalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstring {
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
    public static String longestPalindromic (String s){
        // aacabdkacaa
        String longest = String.valueOf(s.charAt(0));
        outer: for (int i = 0; i < s.length(); i++) {
            int lindex = s.lastIndexOf(s.charAt(i));
            if (lindex != -1) {
                 while(lindex != i && (lindex+1-i) > longest.length()){
                    String subS = s.substring(i,lindex+1);
                    //validate
                    int len = subS.length();
                    for (int j = 0; j < subS.length()/2; j++,len--) {
                        if(subS.charAt(j) != subS.charAt(len-1)){
                            lindex--;
                            continue outer;
                        }
                    }
                    System.out.println(subS);
                    longest = subS.length() > longest.length() ? subS : longest;
                    lindex--;
                }

            }
        }
        return longest;
    }
/*    public static String longestPalindromic (String s){
        // slide window
        int l=0;
        int r=1;
        String longest = "";

        outer: while(l != r){
            String window = s.substring(l,r);
            // Validate
            int subStrLen = window.length();
            //boolean flag = true;
            for (int j = 0; j < window.length()/2; j++, subStrLen--) {
                if(window.charAt(j) != window.charAt(subStrLen-1)){
                    l++;
                    //flag = false;
                    continue outer;
                }
            }
            longest = window.length() > longest.length() ? window : longest;
            if((r+1) <= s.length()-1){
                r++;
            }
        }
        return "";
    }*/

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
