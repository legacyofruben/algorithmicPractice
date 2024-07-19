/*
package JavaConcept.PalindromicSubstring;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstring {
    */
/**
     * 5. Longest Palindromic Substring
     * Given a string s, return the longest palindromic substring
     * in s.
     * Example 1:
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     *
     * Example 2:
     * Input: s = "cbbd"
     * Output: "bb"
     *//*

    public static boolean isPalindromic(String sub){
        int len = sub.length()-1;
        for (int i = 0; i < sub.length()/2; i++,len--) {
            if(sub.charAt(i) != sub.charAt(len)){
                return false;
            }
        }
        return true;
    }
    public static String solution(String s){
        Set<String> dic = new HashSet<>();
        int l=0;
        int r=1;
        while(l != r){
            String sub = s.substring(l,r);
            if(!dic.contains(sub)){
                //validate
                int len = sub.length()-1;
                for (int i = 0; i < sub.length()/2; i++,len--) {
                    if(sub.charAt(i) != sub.charAt(len)){
                        break;
                    }
                }
                dic.add(sub);
            }
        }
    }
}

class PalindromicSubstringTest{
    @Test
    public void test1(){
        assertEquals("bab",PalindromicSubstring.solution("babad"));
    }
}
*/
