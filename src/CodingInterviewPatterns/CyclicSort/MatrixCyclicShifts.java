package CodingInterviewPatterns.CyclicSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * You are given a 0-indexed m x n integer matrix mat and an integer k. You have to cyclically
 * right shift odd indexed rows k times and cyclically left shift even indexed rows k times.
 * Return true if the initial and final matrix are exactly the same and false otherwise.
 * @Link: https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/description/
 */
public class MatrixCyclicShifts {

    public static int[] shift(int[] row){

        return null;
    }
    public static boolean asSimilar(int[][] mat, int k){
        int n =0;
        int[] row = new int[n];
        boolean left = false;
        for (int r = 0; r < mat.length; r++) {
            n = mat[r].length;
            if((r%2)==0){
                int c = k;
                do{
                    if(c == (n)){
                        c=0;
                    }
                    System.out.print(mat[r][c] + " ");
                    c++;
                }while(c!=k);
            }else{
                int c = (n-k);
                do{
                    if(c < 0){
                        c=n-1;
                    }
                    System.out.print(mat[r][c] + " ");
                    c--;
                }while(c!=k);
            }
            System.out.println();
        }
        return true;
    }
}
class MatrixCyclicShiftsTest{
    @Test
    public void asSimilarTest(){
        int[][] matrix = new int[][]{
                {1,2,1,2},
                {5,5,5,5},
                {6,3,6,3}
        };
        matrix = new int[][]{
                {1, 2, 1, 2},
                {5, 5, 5, 5},
                {6, 3, 6, 3}
        };
        assertEquals(true,MatrixCyclicShifts.asSimilar(matrix,2));
    }
}