package ProjectEuler.PowerDigitSum;

import java.math.BigInteger;
import java.util.Arrays;

public class PowerDigitSum {
    //https://projecteuler.net/problem=16
    public static long solution (BigInteger base, BigInteger exp){
        BigInteger result = base.pow(exp.intValue());
        System.out.println(result);
        long sum = 0 ;
        for (char d : String.valueOf(result).toCharArray()){
            sum += Integer.parseInt(String.valueOf(d));
            System.out.print(d + "+");
        }
        System.out.println("=" + sum);
        return sum;
    }
}
