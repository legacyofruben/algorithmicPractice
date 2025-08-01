package ProjectEuler.LatticePaths;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LatticePathsTest {

    @Test
    public void test01(){
        int[][] grid = new int[2][2];
        assertEquals(6,LatticePaths.solution(grid));
    }

    @Test
    public void test02(){
        int[][] grid = new int[20][20];
        assertEquals(137846528820L,LatticePaths.solution(grid));
    }
}
