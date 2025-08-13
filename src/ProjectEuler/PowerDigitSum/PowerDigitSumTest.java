package ProjectEuler.PowerDigitSum;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class PowerDigitSumTest {

    @Test
    public void test01(){
        assertEquals(26,
                PowerDigitSum.solution(new BigInteger("2"),new BigInteger("15")));
    }

    @Test
    public void test02(){
        assertEquals(1366,
                PowerDigitSum.solution(new BigInteger("2"),new BigInteger("1000")));
    }
}
