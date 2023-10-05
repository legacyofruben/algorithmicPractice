package com.Matrix;

public class SumaFilasColumnas {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        print(matrix);
        sumRows(matrix);
        System.out.println();
        sumCol(matrix);
    }
    static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sumRows(int[][] matrix){
        int countRow;
        for (int i = 0; i < matrix.length; i++) {
            countRow = 0;
            for (int j = 0; j < matrix.length; j++) {
                countRow+=matrix[i][j];
            }
            System.out.print("SumRow "+i+": " + countRow);
            System.out.println();
        }
    }

    static void sumCol(int[][] matrix){
        int countCol;
        for (int i = 0; i < matrix.length; i++) {
            countCol = 0;
            for (int j = 0; j < matrix.length; j++) {
                countCol+=matrix[j][i];
            }
            System.out.print("SumCol "+i+": " + countCol);
            System.out.println();
        }
    }

}
