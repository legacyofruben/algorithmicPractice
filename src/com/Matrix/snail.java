package com.Matrix;

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
