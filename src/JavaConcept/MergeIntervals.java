package JavaConcept;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeIntervals {

    /**
     * Given a collection of intervals, merge all overlapping intervals.
     *
     * Write a function merge_intervals(intervals: List[List[int]]) -> List[List[int]] that takes in a list of intervals intervals where each interval is represented as a list [start, end]. The function should merge overlapping intervals and return the resulting list of non-overlapping intervals.
     *
     * Examples:
     * Example 1:
     *
     * python
     * Copy code
     * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Interval [1,3] and [2,6] overlap, so they should be merged into [1,6].
     */

    public static List<int[]> merge(int[][] intervals){
        if(intervals == null) return null;
        if(intervals.length == 0) return List.of();
        if(intervals.length == 1) return List.of(intervals);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        //[[1,3],[2,6],[8,10],[15,18]]
        //[[1,6],[8,10],[15,18]]
        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(nextStart <= end ){
                end = Math.max(nextEnd,end);
            }else{
                list.add(new int[]{start,end});
                start = nextStart;
                end =nextEnd;
            }
        }
        list.add(new int[]{start,end});
        return list;
    }

    public static int[][] merge2(int[][] intervals){
        if(intervals.length == 0) return new int[][]{};
        if(intervals.length == 1) return intervals;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> response = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(nextStart <= end){
                end = Math.max(nextEnd,end);
            }else{
                response.add(new int[]{start,end});
                start = nextStart;
                end = nextEnd;
            }
        }
        response.add(new int[]{start,end});

        return response.toArray(new int[0][0]);
    }




}

class MergeIntervalsTest{
    @Test
    public void mergeTest(){
        int[][] inter = new int[][]{
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };
        int[][] expect = new int[][]{
                {1, 6}, {8, 10}, {15, 18}
        };
        assertEquals(expect.length,MergeIntervals.merge2(inter).length);
    }
    @Test
    public void mergeTest1(){
        int[][] inter = new int[][]{
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };
        int[][] expect = new int[][]{
                {1, 6}, {8, 10}, {15, 18}
        };
        assertEquals(expect,MergeIntervals.merge2(inter));
    }
    @Test
    public void mergeTest2(){
        int[][] inter = new int[][]{
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };
        inter = new int[][]{
                {1,4},
                {2,3}
        };
        inter = new int[][]{
                {1,4},
                {5,6}
        };
        MergeIntervals.merge(inter).forEach(input->{
            System.out.print("["+input[0]+","+input[1]+"],");
        });
    }
}
