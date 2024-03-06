package CodingInterviewPatterns.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxArea {
    /**
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     * Find two lines that together with the x-axis form a container, such that the container contains the most water.
     * Return the maximum amount of water a container can store.
     * Notice that you may not slant the container.
     * Example 1:
     *
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
     * Example 2:
     *
     * Input: height = [1,1]
     * Output: 1
     *
     *
     * Constraints:
     *
     * n == height.length
     * 2 <= n <= 105
     * 0 <= height[i] <= 104
     */

    // 1 4 2 3 5
    // 0  |   |4

    public static int getArea(int w, int h){
        return Math.multiplyExact(w,h);
    }
    public static int maxArea(int[] height){
        if(height.length == 0) return 0;
        if(height.length == 1) return height[0];
        if(height.length == 2) return getArea(1,Math.min(height[0],height[1]));
        int l = 0;
        int r = height.length-1;
        int max = Integer.MIN_VALUE;
        System.out.println("l: "+height[l]+ " r: "+ height[r]+ " max:"+max);
        while(l!=r){
            int h = (r-l)==0 ? 1 : (r-l);
            max = Math.max(max, getArea(h,Math.min(height[l],height[r])));
            System.out.println("l: "+height[l]+ " r: "+ height[r]+ " max:"+max);
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
class MaxAreaTest{
    @Test
    public void maxAreaTest(){
        assertEquals(
                8,
                MaxArea.maxArea(new int[]{1,0,0,0,0,0,0,2,2}));
        assertEquals(
                2,
                MaxArea.maxArea(new int[]{1,2,1}));
        assertEquals(
                49,
                MaxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(
                1,
                MaxArea.maxArea(new int[]{1,1}));
    }
}
