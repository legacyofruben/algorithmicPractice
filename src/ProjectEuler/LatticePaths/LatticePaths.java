package ProjectEuler.LatticePaths;

import java.util.HashMap;
import java.util.Map;

public class LatticePaths {

    static Map<String,Long> memo = new HashMap<>();

    public static long solution (int[][] grid){

        return countPath(0,0,grid.length);
    }

    public static long countPath (int row, int col, int size){
        if(row == size || col == size){
            return 1;
        }
        String key = row + "," + col;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        long down = countPath(row+1, col, size);
        long right =  countPath(row, col+1, size);

        memo.put(key, (down+right));

        return (down+right);
    }
}
