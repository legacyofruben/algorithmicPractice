package LeetCode.StringtoInteger;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringtoInt {
    /**
     * leetcode: https://leetcode.com/problems/string-to-integer-atoi/description/
     */
    public static boolean detected(String regex, char c){
        //Pattern pattern = Pattern.compile("//d+-s");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(c));
        return matcher.find();
/*        try{
            return matcher.start();
        }catch (Exception ex){
            return -1;
        }*/

    }
    public static int myAtoi(String s){
        //1
        StringBuilder str = new StringBuilder(s);
        int l = -1;
        int r = 0;
        boolean neg = false;
        boolean pos = false;
        boolean leadZero = false;


        //2 clean str for letters and spaces
       loop: for (int i = 0; i < s.toCharArray().length; i++) {
            char c = str.charAt(i);
            if(detected("[\\d+\\-\\s]+",c)){
                if(c == ' '){
                    if(r == 0 && l == 0){
                        r = i;
                        break;
                    }
                    r = r != 0 && l != -1 ? i : r;
                    continue;
                }
                switch (c){
                    case '+':
                        pos = true;
                        if(neg){
                            return 0;
                        }
                        if(leadZero || l != -1){
                            r = i;
                            break loop;
                        }
                        continue;
                    case '-':
                        neg = true;
                        if(pos){
                            return 0;
                        }
                        if(leadZero || l != -1){
                            r = i;
                            break loop;
                        }
                        continue;
                    case '0':
                        if(l != 0 && r == 0){
                            leadZero = true;
                            l = i;
                        }
                        break;
                    default:
                        if(leadZero){
                            l = l+1;
                            leadZero = false;
                        }else{
                           if(l == -1){
                               l = i;
                           }
                        }
                        break;
                }
                System.out.print(c);
            }else{
                r = i;
                break;
            }
        }
        r = r == 0 ? s.length() : r;
        if(l == -1)
            return 0;

        long num = neg ? Long.valueOf(s.substring(l,r)) * -1 : Long.parseLong(s.substring(l,r));

        if(Integer.MIN_VALUE > num){
            return Integer.MIN_VALUE;
        }else if(num >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        return Integer.valueOf((int) num);
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


}