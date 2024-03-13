package HackerRank;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @link: https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
 */
public class PickingNumbers {

    public static boolean validate(Set<Integer> list, int num){

        for(int i : list){
            System.out.println(i);
        }
        return false;
    }
    public static int pickingNumbers(List<Integer> a){
        // base case
        int n = a.size();
        if(n == 0) return 0;
        if(n == 1) return 1;
        Set<Integer> list = new HashSet<>();
        int l=0;
        int r=1;
        list.add(a.get(l));
        while (r < n){
            if(validate(list,a.get(r))){

            }
            System.out.print(a.get(r++));
        }
        return 0;
    }
}
class PickingNumbersTest{
    @Test
    public void pickingNumbersTest(){
        List<Integer> input = List.of(1,1,2,2,4,4,5,5,5);
        assertEquals(5,PickingNumbers.pickingNumbers(input));
    }
}
