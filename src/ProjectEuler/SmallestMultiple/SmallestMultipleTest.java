package ProjectEuler.SmallestMultiple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestMultipleTest{
    @Test
    public void test_01(){
        assertEquals(2520,SmallestMultiple.solution(new int[]{1,10}));
    }

    @Test
    public void test_02(){
        assertEquals(232792560,SmallestMultiple.solution(new int[]{1,20}));
    }
}
