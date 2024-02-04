package JavaConcept;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletSum {

    public static void getPair(int target, int[] arr){
        Map<Integer,Integer> mapComp = new HashMap<>();
        System.out.print(target + " ");
        for(int j=0;j<arr.length;j++){
            if(arr[j] != target){
                if (mapComp.containsKey(arr[j])){
                    System.out.println(arr[j] + " " + mapComp.get(arr[j]));
                }else{
                    int complement = arr[j] >=0 ? arr[j] - target:arr[j];
                    mapComp.put(complement,j);
                }
            }
        }
    }
    public static List<List<Integer>> searchTriplets(int[] arr){
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            getPair(arr[i],arr);
        }

        return triplets;
    }
}
class TripletSumTest{
    @Test
    public void searchTripletsTest(){
        int[] arr = new int[]{-3, 0, 1, 2, -1, 1, -2};
        assertEquals(List.of(
                List.of(-3, 1, 2),
                List.of(-2, 0, 2),
                List.of(-2, 1, 1),
                List.of(-1, 0, 1)
        ),TripletSum.searchTriplets(arr));
    }
}
