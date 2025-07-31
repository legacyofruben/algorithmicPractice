package ProjectEuler.TriangularNumber;

import java.util.HashMap;
import java.util.Map;

public class TriangularNumber {
    static long[] trianNumbers = new long[2];
    public static long getTriangularNumber (int number){
        long tn = 0;
        for (int i = 1; i <= number; i++) {
            tn+=i;
        }
        return tn;
    }

    public static long getDivisors (long number){
        long count = 0;
        for (long i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (i * i != number) {
                    count++;
                }
            }
        }
        return count;
    }

    public static long solution( int _divisors){
        trianNumbers[0] = 1L;
        trianNumbers[1] = 1L;
        System.out.println(trianNumbers);
        int i = 1;
        long tn = getTriangularNumber(i);
        while (trianNumbers[1] <= _divisors) {
            i ++;
            tn = getTriangularNumber(i);
            while(trianNumbers[0] < tn){
                System.out.println("Triangular number: " + tn);
                trianNumbers[0] = tn ;
                trianNumbers[1] = getDivisors(tn) ;
                System.out.println(trianNumbers[1]);
            }
        }

        return tn;
    }
}
