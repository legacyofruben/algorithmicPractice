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
        boolean leadZero = false;

        //2 clean str for letters and spaces
       loop: for (int i = 0; i < s.toCharArray().length; i++) {
            char c = str.charAt(i);
            if(detected("[\\d+\\-\\s]+",c)){
                if(c == ' '){
                    r = r != 0 ? i : r;
                    continue;
                }
                switch (c){
                    case '+': neg = false;
                        if(leadZero || l != -1){
                            r = i;
                            break loop;
                        }
                        continue;
                    case '-': neg = true;
                        if(leadZero || l != -1){
                            r = i;
                            break loop;
                        }
                        continue;
                    case '0': leadZero = true;
                              l = i;
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

        return neg ? Integer.valueOf(s.substring(l,r)) * -1 : Integer.parseInt(s.substring(l,r));
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

}