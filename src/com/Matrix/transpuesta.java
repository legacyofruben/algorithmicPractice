package com.Matrix;

public class transpuesta {

    /**
     *
     *  1 2 3      1 4 7
     *  4 5 6  =>  2 5 8
     *  7 8 9      3 6 9
     */
    static int[][] matrix = new int[3][3];

    public static void main(String[] args) {
        fillMatrix();
        print();
        System.out.println();
        transpuesta();
        print();
    }

    static void fillMatrix(){
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }

    }

    static void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpuesta(){
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = count;
                count++;
            }
        }
    }
}
