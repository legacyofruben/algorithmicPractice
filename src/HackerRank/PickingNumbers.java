package HackerRank;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @link: https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
 */
public class PickingNumbers {

    public static boolean validate(Set<Integer> set, List<Integer> a,  int l, int r){
        if(!set.contains(a.get(r)) || !set.contains(a.get(l))){
            int diffAbs = Math.abs(a.get(l) - a.get(r));
            if(diffAbs == 0 || diffAbs == 1){
                set.add(a.get(l));
                set.add(a.get(r));
                return true;
            }
            return false;
        }
        return true;
    }
    public static int pickingNumbers(List<Integer> a){
        // base case
        int n = a.size();
        if(n == 0) return 0;
        if(n == 1) return 1;
        Collections.sort(a);
        Set<Integer> set = new HashSet<>();
        int l=0;
        int r=1;
        int max = r-l;
        while (r < n){
            if(validate(set,a,l,r)){
                r++;
            }else{
                set.clear();
                max = Math.max(max, (r-l));
                l = r;
                r = l+1;
            }
        }
        return Math.max(max, (r-l));
    }
}
class PickingNumbersTest{
    @Test
    public void pickingNumbersTest(){
        Integer[] values = new Integer[]{1,1,2,2,4,4,5,5,5};
        //assertEquals(5,PickingNumbers.pickingNumbers(new ArrayList<>(Arrays.asList(values))));
        values = new Integer[]{4, 6, 5, 3, 3, 1};
        //assertEquals(3,PickingNumbers.pickingNumbers(new ArrayList<>(Arrays.asList(values))));
        values = new Integer[]{1,2,2,3,1,2};
        assertEquals(5,PickingNumbers.pickingNumbers(new ArrayList<>(Arrays.asList(values))));
    }
}
