package ProjectEuler.EvenFibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenFibonacci {
    public static long solution (int limit){
        long n1 = 1;
        long n2 = 2;
        long next = 0;
        long sum = 2;

        while(sum < limit){
            next = n1 + n2;
            System.out.print(next);
            if((next%2) == 0 ){
                sum += next;
                System.out.print(" " + sum);
            }
            System.out.println();
            n1 = n2;
            n2 = next;
        }
        return sum;
    }
}
class EvenFibonacciTest{
    @Test
    public void test_01 (){
        assertEquals(4613732,EvenFibonacci.solution(4_000_000));
    }
}
