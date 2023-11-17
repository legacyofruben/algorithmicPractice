package AlgorithmsCourse.Heaps;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KLargest {
    /*
     * Diseña una clase para obtener el kth elemento más grande de un stream de datos.
     *
     * KthLargest(int k, int[] nums) Inicializa el objecto con el valor de K y con el conjunto de datos.
     * int add(int val) Añade un nuevo elemento y devuelve el kth mayor actual.
     *
     * Ejemplo:
     *  Input:
     *    k = 4
     *    nums = [1, 2, 3, 4, 5]
     *
     *  Output:
     *    add(6) = 3
     *    add(1) = 3
     *    add(8) = 4
     */

    private int k;
    private PriorityQueue<Integer> heap;
    public KLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        for(int n : nums){
            heap.add(n);
        }
        while(heap.size() > k){
            heap.poll();
        }
    }

    public int add(int val) {
        heap.add(val);
        if(heap.size() > k){
            heap.poll();
        }
        return heap.peek();
    }
}
class KLargestTest{
    @Test
    public void getKLargestTest(){
        KLargest heap = new KLargest(4, new int[]{1,2,3,4,5});
        assertEquals(3,heap.add(6));
        assertEquals(3,heap.add(1));
        assertEquals(4,heap.add(8));
    }
}
