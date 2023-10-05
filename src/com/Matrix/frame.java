package com.Matrix;

public class frame {

    // Fill the frame of a matrix with 1's and with 0's  the rest of cells inside the matrix
    /*
    1111
    1001
    1001
    1111
     */
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix = fillMatrix(matrix);
        print(matrix);
    }
    static int[][] fillMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i==0 || i == (matrix.length-1) ||
                        j==0 || j == (matrix.length-1)){
                    matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }
    static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
