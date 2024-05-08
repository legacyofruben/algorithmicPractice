package HackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTriplets {
    /**
     * @link: https://www.hackerrank.com/challenges/count-triplets-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
     */

    public void fillGP(HashMap<Long,List<Long>> dic,long l){

    }
    public static long countTriplets(List<Long> arr, long r) {
        if (arr == null) return 0;
        if (arr.size() < 3) return 0;

        HashMap<Long,List<Long>> dic = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1 || (arr.get(i) % r) != 0){

            }
        }

        return 0;
    }
}
class CountTripletsTest{
    @Test
    public void countTripletsTest_1(){
        List<Long> input = new ArrayList<>(){};
        input.add(1L);
        input.add(4L);
        input.add(16L);
        input.add(64L);
        assertEquals(2,CountTriplets.countTriplets(input, 4));
    }
}
