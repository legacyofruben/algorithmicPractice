package CodingInterviewPatterns.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsNearbyDuplicate {

    /**
     * [1,2,3,1] <= 3
     * ((k+i)-(i+1))
     * ((k+i)-(i+1))
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k){

        int l=0;
        int r=1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
            for (int j = i+1; j < n; j++) {
                System.out.print(nums[j]+" ");
            }
        }
        return false;
    }
}
class ContainsNearbyDuplicateTest{
    @Test
    public void containsNearbyDuplicateTest(){
        assertTrue(
                ContainsNearbyDuplicate.containsNearbyDuplicate(
                        new int[]{1,2,3,1},3));
        /*assertTrue(
                ContainsNearbyDuplicate.containsNearbyDuplicate(
                        new int[]{1,0,1,1},1));

        assertFalse(
                ContainsNearbyDuplicate.containsNearbyDuplicate(
                        new int[]{1,2,3,1,2,3},2));

        assertFalse(
                ContainsNearbyDuplicate.containsNearbyDuplicate(
                        new int[]{1,2,1},0));*/

        assertTrue(
                ContainsNearbyDuplicate.containsNearbyDuplicate(
                        new int[]{0,1,2,3,2,5},3));
    }
}

