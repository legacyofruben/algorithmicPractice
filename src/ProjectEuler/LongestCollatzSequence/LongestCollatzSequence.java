package ProjectEuler.LongestCollatzSequence;

import java.util.HashMap;

//https://projecteuler.net/problem=14
public class LongestCollatzSequence {

    public static long  solution (long start){
        /*long count;
        long tmp;
        long max = 0;
        while (start > 0){
            count=1;
            tmp = start;
            System.out.print(start + " ");
            while (tmp != 1){
                tmp = (tmp%2) == 0 ? tmp/2 : (tmp*3) + 1;
                count++;
                System.out.print(tmp + " ");
            }
            System.out.println();
            max = Math.max(max,count);
            System.out.println("max: " + max);
            start--;
        }
        return max;*/

        HashMap<Long, Integer> memo = new HashMap<>();
        memo.put(1L,1); //base case
        System.out.println("memo[1] = 1 (caso base)");

        long limit = start;
        long bestStart = 1;
        int maxLength = 1;

        for (long i = 2; i < limit; i++) {
            long n = i;
            int len = 0;

            System.out.println("\n📌 Analizando número: " + i);
            // Save memo
            while(!memo.containsKey(n)){
                System.out.print(n + " → ");
                n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
                len++;
            }
            len+=memo.get(n);
            memo.put(i,len);
            System.out.println(n + " (conocido), longitud total = " + len);
            System.out.println("memo[" + i + "] = " + len);
            if (len > maxLength) {
                maxLength = len;
                bestStart = i;
                System.out.println("✅ Nuevo máximo encontrado: " + i + " con longitud " + len);
            }
        }
        System.out.println("\n==========================");
        System.out.println("Número con cadena más larga: " + bestStart);
        System.out.println("Longitud de la cadena: " + maxLength);

        return bestStart;
    }
}
