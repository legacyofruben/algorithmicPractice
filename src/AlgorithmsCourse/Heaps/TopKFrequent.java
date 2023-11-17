package AlgorithmsCourse.Heaps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopKFrequent {
    /*
     * Dado un conjunto de elementos y un valor k, devuelve los K elementos más frecuentes.
     * Se pueden devolver en cualquier orden.
     *
     * Ejemplo:
     *  Input:
     *    nums = [1,1,1,2,2,3]
     *    k = 2
     *
     *  Output:
     *    [1,2]
     *
     * Input:
     *    nums = [1,1,2,2,3,3,3]
     *    k = 1
     *
     *  Output:
     *    [3]
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res[i] = entry.getKey();
        }

        return res;
    }
}
class TopKFrequentTest{
    @Test
    public void topKFrequentTest(){
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] result = topKFrequent.topKFrequent(new int[]{1,1,1,2,2,3},2);
        assertEquals(1,result[0]);
        assertEquals(2,result[1]);
    }
}
