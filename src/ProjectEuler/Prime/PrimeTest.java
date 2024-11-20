package ProjectEuler.Prime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeTest{

    @Test
    public void test_00(){
        assertEquals(2, Prime.solution(1));
    }

    @Test
    public void test_01(){
        assertEquals(13, Prime.solution(6));
    }
    @Test
    public void test_02(){
        assertEquals(104743, Prime.solution(10_001));
    }
}
