package JavaConcept;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    public static List<List<Integer>> merge_intervals(List<List<Integer>> intervals){
        /*List<List<Integer>> r = new ArrayList<>();
        for (List<Integer> l:intervals) {
            if (r.isEmpty()) {
                r.add(List.of(l.get(0),l.get(1)));
                continue;
            }
            if(l.get(0) <= r.get(r.size()-1).get(1)){
                int pos0 = r.get(r.size()-1).get(0);
                r.remove(r.size()-1);
                r.add(List.of(pos0,l.get(1)));
            }else{
                r.add(l);
            }
        }*/
        if(intervals.size() == 0) return List.of();
        if(intervals.size() == 1) return List.of(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).get(0) <= intervals.get(i-1).get(1)) {
                int pos1 = intervals.get(i).get(1);
                intervals.get(i-1).set(1,pos1);
                intervals.remove(i);
                i--;
            }
        }
        return intervals;
    }
}

class MergeIntervalsTest{
    @Test
    public void merge_intervalsTest(){
        List<List<Integer>> intervals = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(2,6)),
                new ArrayList<>(Arrays.asList(8,10)),
                new ArrayList<>(Arrays.asList(15,18))
        ));

        assertEquals(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,6)),
                new ArrayList<>(Arrays.asList(8,10)),
                new ArrayList<>(Arrays.asList(15,18)))
        ),MergeIntervals.merge_intervals(intervals));

        /**
         * Input: intervals = [[1,4],[4,5]]
         * Output: [[1,5]]
         */
        intervals = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,4)),
                new ArrayList<>(Arrays.asList(4,5))
        ));
        assertEquals(List.of(
                List.of(1,5)
        ),MergeIntervals.merge_intervals(intervals));
    }
}
