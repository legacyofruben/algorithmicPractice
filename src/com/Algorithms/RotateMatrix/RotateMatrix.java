package com.Algorithms.RotateMatrix;

public class RotateMatrix {
    /*          j
                |
                v
    i -> (0,0)  1   2   3   (0,4)
                4   5   6
         (4,0)  7   8   9   (4,4)
    */

    public static int[][] rotate(int[][] matrix){
        if(matrix==null || matrix.length==0){
            return null;
        }
        int n=matrix.length;

        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-1; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = t;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }
    public static void main(String[] args) {
        System.out.println("Rotate Matrix");
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        matrix = rotate(matrix);
    }
}
