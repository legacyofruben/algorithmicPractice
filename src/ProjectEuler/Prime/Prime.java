package ProjectEuler.Prime;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Prime {

    public static int nextPrime(int lastPrime) {
        int div = 1;
        int num = lastPrime+1;
        while (true) {
            for (int j = 2; j < num; j++) {
                if ((num % j) == 0) {
                    div++;
                }
                if(div >= 2){
                    break;
                }
            }
            if(div >= 2){
                div = 1;
                num++;
            }else{
                break;
            }
        }
        return num;
    }

    public static int solution(int input) {
        if (input <= 0) {
            return 0;
        }
        List<int[]> primes = new ArrayList<>();
        primes.add(new int[]{1, 2});
        if (input == 1) {
            return 2;
        }
        input--;
        while (input != 0) {
            primes.add(new int[]{
                    primes.getLast()[0] + 1,
                    nextPrime(primes.getLast()[1])
            });
            input--;
        }

        return primes.getLast()[1];
    }
}

/**
 * public class NEsimoPrimo {
 *
 *     // Método para verificar si un número es primo
 *     public static boolean esPrimo(int numero) {
 *         if (numero < 2) {
 *             return false;
 *         }
 *         for (int i = 2; i <= Math.sqrt(numero); i++) {
 *             if (numero % i == 0) {
 *                 return false;
 *             }
 *         }
 *         return true;
 *     }
 *
 *     // Método para encontrar el n-ésimo número primo
 *     public static int encontrarNesimoPrimo(int n) {
 *         int contador = 0; // Contador de números primos encontrados
 *         int numero = 1;   // Número actual que se está evaluando
 *
 *         while (contador < n) {
 *             numero++;
 *             if (esPrimo(numero)) {
 *                 contador++;
 *             }
 *         }
 *         return numero;
 *     }
 *
 *     public static void main(String[] args) {
 *         int n = 10001; // Queremos encontrar el 10,001º número primo
 *         int resultado = encontrarNesimoPrimo(n);
 *         System.out.println("El 10,001º número primo es: " + resultado);
 *     }
 * }
 */