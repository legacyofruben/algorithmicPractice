package CodingInterviewPatterns.SlidingWindow;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarraySum {
    /**
     *  Supongamos que tenemos un problema en el que necesitamos encontrar la suma máxima de subarreglos de longitud k en un arreglo dado.
     */
    public static int maxSubarraySum(int[] arr, int k){
        if(arr == null || arr.length<k) return 0;
        int n = arr.length;
        int sumMax= 0;
        int sumWin = 0;
        for (int i = 0; i < k; i++) {
            sumMax+=arr[i];
        }
        // 4, 2, 1, 7, 8, 1, 2, 8, 1, 0
        sumWin=sumMax;
        for (int i = k; i < n; i++) {
            sumWin += arr[i]-arr[i-k];
            sumMax = Math.max(sumMax,sumWin);
        }

        return sumMax;
    }

    public static int maxSubarraySumNonCons(int[] arr, int k){
        if(arr == null || arr.length<k) return 0;
        Arrays.sort(arr);
        int sumMax = 0;
        for (int i = arr.length-1; k>0; i--) {
            sumMax+=Math.max(arr[i],sumMax);
            k--;
        }
        return sumMax;
    }
}
class MaximumSubarraySumTest{
    @Test
    public void maxSubarraySumTest(){
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        assertEquals(16,MaximumSubarraySum.maxSubarraySum(arr,3));
        assertEquals(23,MaximumSubarraySum.maxSubarraySumNonCons(arr,3));
    }
}
