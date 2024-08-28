package AlgorithmsCourse.ZeroMatrix;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    static int[][] matrix = new int[][]{
            {2,1,3,0,2},
            {7,4,1,2,8},
            {4,0,1,2,1},
            {9,3,4,1,9}
    };

    public static void change(){
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        row.forEach(x -> {
            int colum = 0;
            while (colum<matrix[x].length){
                matrix[x][colum]=0;
                colum++;
            }
        });
        col.forEach(x->{
            int r = 0;
            while(r<matrix.length){
                matrix[r][x]=0;
                r++;
            }
        });


    }

    public static int zeroMatrix(){
        change();
        print();
        return 0;
    }
    public static void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
