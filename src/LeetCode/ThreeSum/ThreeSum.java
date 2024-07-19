/*
package LeetCode.ThreeSum;

import com.Algorithms.Anagram.Solution;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSum {
    */
/**
     * link: https://leetcode.com/problems/3sum/description/
     *//*


    public static List<List<Integer>> addSol(int[] index, int[] nums, List<List<Integer>> solutions){
        List<Integer> list = List.of(nums[index[0]],nums[index[1]],nums[index[2]]);
        if(!solutions.contains(list)){
            solutions.add(list);
        }
        return solutions;
    }
    public static List<List<Integer>> Solution(int[] nums){
        if(nums.length < 3) return List.of();
        int l = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> solutions = new ArrayList<>();

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer[]> map2 = new HashMap<>();
        for (int f = 0; f < l; f++) {
            int comp = 0 - (nums[f]);
            if(map2.containsKey(comp)){
                solutions = addSol(new int[]{f, map2.get(comp)[0], map2.get(comp)[1]}, nums, solutions);
            }else{
                for (int s = f+1; s < l; s++){
                    map1.put(comp,nums[s]);
                    int comp2 = 0 - (nums[f] + nums[s]);
                    if(map1.containsKey(comp2)){
                        solutions = addSol(new int[]{f, map1.get(comp)[0], map1.get(comp)[1]}, nums, solutions);
                    }else{
                        for (int t = s+1; t < l; t++) {
                            map2.put((nums[f] + nums[s] + nums[t]),t);
                            if((nums[f] + nums[s] + nums[t]) == 0){
                                //map.put((nums[s] + nums[t]),List.of(s,t));
                                //List<Integer> list = new ArrayList<>(List.of(nums[f],nums[s],nums[t]));
                                solutions = addSol(new int[]{f,s,t}, nums, solutions);
                            }
                        }
                    }
                }
            }

        }

        return solutions;
    }
}
class ThreeSumTest{
    @Test
    public void Test_01(){
        List<List<Integer>> result = List.of(
                List.of(-1,-1,2),
                List.of(-1,0,1)
        );
        assertEquals(result, ThreeSum.Solution(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    public void Test_02(){
        assertEquals(List.of(), ThreeSum.Solution(new int[]{0,1,1}));
    }
    @Test
    public void Test_03(){
        List<List<Integer>> result = List.of(
                List.of(0,0,0)
        );
        assertEquals(result, ThreeSum.Solution(new int[]{0,0,0}));
    }
}*/
