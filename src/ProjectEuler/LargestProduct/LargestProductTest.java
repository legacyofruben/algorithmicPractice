package ProjectEuler.LargestProduct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestProductTest{
    @Test
    public void test01() {
        assertEquals(5832,LargestProduct.solution(4));
    }
    @Test
    public void test02() {
        assertEquals(23514624000L,LargestProduct.solution(13));
    }
}
