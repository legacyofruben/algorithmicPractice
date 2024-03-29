package CodingInterviewPatterns.Island_Matrix_Traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandPerimeter {
    /**
     * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
     * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island
     * (i.e., one or more connected land cells). The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
     * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
     * Example 1:
     *
     * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
     * Output: 16
     * Explanation: The perimeter is the 16 yellow stripes in the image above.
     * Example 2:
     *
     * Input: grid = [[1]]
     * Output: 4
     * Example 3:
     *
     * Input: grid = [[1,0]]
     * Output: 4
     *
     * https://leetcode.com/problems/island-perimeter/description/
     */
    public static int islandPerimeter(int[][] grid){
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(grid[r][c]==1){
                    count = dfsIsland(grid,r,c,count);
                    return count;
                }
            }
        }
        return count;
    }
    public static int dfsIsland(int[][] grid, int r, int c, int count){
        if((r < 0 || r >= grid.length) || (c < 0 || c >= grid[0].length) || (grid[r][c] == 0)){
            return ++count;
        }else if(grid[r][c] == 2){
            return count;
        }
        grid[r][c] = 2;
        count = dfsIsland(grid,r-1,c,count) ;//4    //
        count = dfsIsland(grid,r,c-1,count);//4     //
        count = dfsIsland(grid,r,c+1,count);//4     //
        count = dfsIsland(grid,r+1,c,count);//dowm  //

        return count;
    }
}

class IslandPerimeterTest{
    @Test
    public void islandPerimeterTest(){
        /*int[][] grid = new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        assertEquals(16,
                IslandPerimeter.islandPerimeter(grid));
        int[][] grid = new int[][]{
                {1}};
        assertEquals(4,
                IslandPerimeter.islandPerimeter(grid));*/
        int[][] grid = new int[][]{
                {1,0}};
        assertEquals(4,
                IslandPerimeter.islandPerimeter(grid));

    }
}
