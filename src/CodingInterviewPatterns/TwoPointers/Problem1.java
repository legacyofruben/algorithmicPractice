package CodingInterviewPatterns.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given an array of numbers sorted in ascending order and a target sum, find a pair in the array whose sum is equal to the given target.
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target. If no such pair exists return [-1, -1].
 * <p>
 * Example 1:
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 * <p>
 * Example 2:
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 */

public class Problem1 {
    public static int[] search(int[] arr, int targetSum){
        for (int l=0,r=l+1; l < arr.length-1 ; ) {
            if(r==arr.length-1){
                l++;
                r=l+1;
            }else{
                if((arr[l] + arr[r]) == targetSum){
                    return new int[]{l,r};
                }else{
                    r++;
                }
            }
        }
        return new int[]{};
    }
}
class Problem1Test{
    @Test
    public void testCase1(){
        int[] input = new int[]{1, 2, 3, 4, 6};
        int targetSum = 6;
        assertEquals(1,Problem1.search(input,targetSum)[0]);
        assertEquals(3,Problem1.search(input,targetSum)[1]);
    }
    @Test
    public void testCase2(){
        int[] input = new int[]{2, 5, 9, 11};
        int targetSum = 11;
        assertEquals(0,Problem1.search(input,targetSum)[0]);
        assertEquals(2,Problem1.search(input,targetSum)[1]);
    }
}
