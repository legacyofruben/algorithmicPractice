package ProjectEuler.LongestCollatzSequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCollatzSequenceTest {

    @Test
    public void test01(){
        assertEquals(9,LongestCollatzSequence.solution(13));
    }
    @Test
    public void test02(){
        assertEquals(837799,LongestCollatzSequence.solution(1_000_000));
    }
}
