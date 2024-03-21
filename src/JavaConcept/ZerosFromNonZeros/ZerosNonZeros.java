package JavaConcept.ZerosFromNonZeros;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZerosNonZeros {
    /**
     * Given an integer array, you have to separate all zero elements
     * from non-zero elements. You have to move zeros either to end of
     * the array or bring them to beginning of the array.
     * For example, if {14, 0, 5, 2, 0, 3, 0} is the given array,
     * then moving zeros to end of the array will result
     * {14, 5, 2, 3, 0, 0, 0} and bringing zeros to front
     * will result {0, 0, 0, 14, 5, 2, 3}.
     * @Link: https://javaconceptoftheday.com/how-to-separate-zeros-from-non-zeros-in-an-array/
     */
    public static String moveZerosToEnd(int[] inputArray){
        //base case
        if(inputArray==null) return null;
        if(inputArray.length == 0) return Arrays.toString(new int[]{});
        if(inputArray.length == 1) return Arrays.toString(inputArray);

        int n = inputArray.length;
        int l=0;
        int r=1;
        while(l < n){
            if(r == n) break;
            if((inputArray[l]!=0 && inputArray[r]!=0 )||
                    (inputArray[l]!=0 && inputArray[r]==0)){
                l++;
                r++;
            }else if(inputArray[l]==0 && inputArray[r]==0 ){
                r++;
            } else if(inputArray[l]==0 && inputArray[r]!=0){
                inputArray[l++] = inputArray[r];
                inputArray[r++] = 0;
            }
        }
        return Arrays.toString(inputArray);
    }

    public static String moveZerosToFront(int[] inputArray){
        //base case
        if(inputArray==null) return null;
        if(inputArray.length == 0) return Arrays.toString(new int[]{});
        if(inputArray.length == 1) return Arrays.toString(inputArray);

        int n = inputArray.length-1;
        int index = n;
        while(index>=0){
            if(inputArray[index] !=0 ){
                inputArray[n--] = inputArray[index--];
            }else if(inputArray[index]==0){
                index--;
            }
        }
        while(n >= 0){
            inputArray[n--] = 0;
        }
        return Arrays.toString(inputArray);
    }


}
class ZerosNonZerosTest{
    @Test
    public void moveZerosToEndTest_1(){
        assertEquals(Arrays.toString(new int[]{12, 7, 8, 3, 0, 0, 0}),
                ZerosNonZeros.moveZerosToEnd(new int[]{12, 0, 7, 0, 8, 0, 3}));
    }
    @Test
    public void moveZerosToEndTest_2(){
        assertEquals(Arrays.toString(new int[]{1, -5, 8, 1, 0, 0, 0}),
                ZerosNonZeros.moveZerosToEnd(new int[]{1, -5, 0, 0, 8, 0, 1}));
    }

    @Test
    public void moveZerosToEndTest_3(){
        assertEquals(Arrays.toString(new int[]{1, 1, -5, 4, 0, 0, 0}),
                ZerosNonZeros.moveZerosToEnd(new int[]{0, 1, 0, 1, -5, 0, 4}));
    }
    @Test
    public void moveZerosToEndTest_4(){
        assertEquals(Arrays.toString(new int[]{-4, 1, 2, 21, 4, 0, 0}),
                ZerosNonZeros.moveZerosToEnd(new int[]{-4, 1, 0, 0, 2, 21, 4}));
    }

    /**
     *  Move Zeros to front
     */
    @Test
    public void moveZerosToFrontTest_1(){
        assertEquals(Arrays.toString(new int[]{0, 0, 0, 12, 7, 8, 3}),
                ZerosNonZeros.moveZerosToFront(new int[]{12, 0, 7, 0, 8, 0, 3}));
    }
    @Test
    public void moveZerosToFrontTest_2(){
        assertEquals(Arrays.toString(new int[]{0, 0, 0, 1, -5, 8, 1}),
                ZerosNonZeros.moveZerosToFront(new int[]{1, -5, 0, 0, 8, 0, 1}));
    }

    @Test
    public void moveZerosToFrontTest_3(){
        assertEquals(Arrays.toString(new int[]{0, 0, 0, 1, 1, -5, 4}),
                ZerosNonZeros.moveZerosToFront(new int[]{0, 1, 0, 1, -5, 0, 4}));
    }
    @Test
    public void moveZerosToFrontTest_4(){
        assertEquals(Arrays.toString(new int[]{0, 0, -4, 1, 2, 21, 4}),
                ZerosNonZeros.moveZerosToFront(new int[]{-4, 1, 0, 0, 2, 21, 4}));
    }

}
