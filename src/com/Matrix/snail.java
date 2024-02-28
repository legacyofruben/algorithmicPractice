package com.Matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class snail {
    static int[][]  matrix = new int[5][5];

    /*
    * 1 2 3
    * 8 9 4
    * 7 6 5
    */

    public static void snailOrder(){
        int n = matrix[0].length;
        int m = matrix.length;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        int count = 1;

        while(rowStart<=rowEnd || colStart<=colEnd){
            // left to right
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = count++;
            }
            // up to down
            for (int row = rowStart+1; row <= rowEnd; row++) {
                matrix[row][colEnd] = count++;
            }
            // right to left
            for (int col = colEnd-1; col >= colStart; col--) {
                matrix[rowEnd][col] = count++;
            }
            // down to up
            for (int row = rowEnd-1; row >= rowStart+1; row--) {
                matrix[row][colStart] = count++;
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }
    public static void main(String[] args) {
        snailOrder();
        print(matrix);
    }

    public static void print(int[][] matrix){
        for (int[] r: matrix) {
            for (int c: r) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }


    public static int[][] caracol() {
        int[][] matrix = new int[5][5];
        // Variables
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        int counter = 1;

        // General loop
        while(startRow <= endRow && startCol <= endCol){
            // left -> right
            for (int col = startCol; col <= endCol; col++) {
                matrix[startRow][col] = counter++;
            }
            startRow++;
            // up -> down
            for (int row = startRow; row <= endRow ; row++) {
                matrix[row][endCol] = counter++;
            }
            endCol--;
            if(startRow <= endRow){
                // right -> left
                for (int col = endCol; col >= startCol; col--) {
                    matrix[endRow][col] = counter++;
                }
                endRow--;
            }

            if(startCol <= endCol){
                // down -> up
                for (int row = endRow; row >= startRow ; row--) {
                    matrix[row][startCol] = counter++;
                }
                startCol++;
            }
        }
        print(matrix);
        return matrix;
    }

    /**
     *      j0  j1  j2  j3  j4
     * i0   1	2	3	4	5
     * i1   16	17	18	19	6
     * i2   15	24	25	20	7
     * i3   14	23	22	21	8
     * i4   13	12	11	10	9
     */

    public static int[][] rotateMatrix(int[][] matrix){
        int n = matrix.length;
        // Print half matrix
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-1-i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = tmp;
            }
            System.out.println();
        }
       print(matrix);
        return matrix;
    }
}


class snailTest{
    @Test
    public void caracolRotateTest(){
        int m[][] = snail.caracol();
        assertNotEquals(null,m);
        System.out.println();
        assertNotEquals(null,snail.rotateMatrix(m));
    }
}