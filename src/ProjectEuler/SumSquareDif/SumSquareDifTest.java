package ProjectEuler.SumSquareDif;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumSquareDifTest{
    @Test
     public void test_01(){
        assertEquals(2640 , SumSquareDif.solution(10));
    }
    @Test
    public void test_02(){
        assertEquals(25_164_150 , SumSquareDif.solution(100));
    }
 }
