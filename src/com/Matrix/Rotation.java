package com.Matrix;

public class Rotation {

    static int[][]  matrix = new int[][]{
              /* columns */
            {1 ,2 ,3 ,4 ,5 },
            {6 ,7 ,8 ,9 ,10},
    /*rows*/{11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
    };

    public static void rotate(){
        int n = matrix.length;

        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-1-i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = t;
                //print();
            }
            //break;
        }
    }

    public static void main(String[] args) {
        rotate();
        System.out.println();
        print();
    }

    public static void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
