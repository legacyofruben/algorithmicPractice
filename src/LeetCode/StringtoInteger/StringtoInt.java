package LeetCode.StringtoInteger;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringtoInt {
    /**
     * leetcode: https://leetcode.com/problems/string-to-integer-atoi/description/
     */

    public static boolean isDigit(int c){
        int zero = '0';
        int nine = '9';
        if(c >= zero && c <= nine){
            return true;
        }
        return false;
    }

    public static int myAtoi(String s) {
        long num = -1;
        boolean negative = false;
        //num = num == -1 ? Integer.parseInt(String.valueOf(c)) : (num*10) + Integer.parseInt(String.valueOf(c));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (c == '+' || c == '-') {
                if ((i + 1) < s.length() && isDigit(s.charAt(i + 1))) {
                    negative = c == '-' ? true : false;
                } else {
                    break;
                }
            } else if (isDigit(c)) {
                int j = i;
                while (j < s.length() && isDigit(s.charAt(j))) {
                    int i1 = Integer.parseInt(String.valueOf(s.charAt(j)));
                    num = num == -1 ? i1 : (num * 10) + i1;
                    if(num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) break;
                    j++;
                }
                break;
            } else {
                return 0;
            }
        }

        if (negative) {
            num = num * -1;
            if(num == -1 ) return -1;
        }

        if(num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return num == -1 ? 0 : (int)num;
    }
}

class StringToIntTest{
    @Test
    public void test0(){
        assertEquals(42,StringtoInt.myAtoi("42"));
    }
    @Test
    public void test1(){
        assertEquals(-42,StringtoInt.myAtoi("   -042"));
    }
    @Test
    public void test2(){
        assertEquals(1337,StringtoInt.myAtoi("1337c0d3"));
    }

    @Test
    public void test3(){
        assertEquals(0,StringtoInt.myAtoi("0-1"));
    }

    @Test
    public void test4(){
        assertEquals(0,StringtoInt.myAtoi("words and 987"));
    }

    @Test
    public void test5(){
        assertEquals(4193,StringtoInt.myAtoi("4193 with words"));
    }

    @Test
    public void test6(){
        assertEquals(Integer.MIN_VALUE,StringtoInt.myAtoi("-91283472332"));
    }

    @Test
    public void test7(){
        assertEquals(Integer.MAX_VALUE,StringtoInt.myAtoi("91283472332"));
    }

    @Test
    public void test8(){
        assertEquals(0,StringtoInt.myAtoi("+-12"));
    }

    @Test
    public void test9(){
        assertEquals(2147483647,StringtoInt.myAtoi("21474836460"));
    }
    @Test
    public void test10(){
        assertEquals(0,StringtoInt.myAtoi("    0000000000000   "));
    }
    @Test
    public void test11(){
        assertEquals(-1,StringtoInt.myAtoi("-1"));
    }
    @Test
    public void test12(){
        assertEquals(2147483647,StringtoInt.myAtoi("9223372036854775808"));
    }

    @Test
    public void test13(){
        assertEquals(-2147483648,StringtoInt.myAtoi("-91283472332"));
    }


}