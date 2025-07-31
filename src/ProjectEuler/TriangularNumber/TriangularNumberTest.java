package ProjectEuler.TriangularNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangularNumberTest {

    @Test
    public void test01(){
        assertEquals(28,TriangularNumber.solution(5));
    }

    @Test
    public void test02(){
        assertEquals(76576500,TriangularNumber.solution(500));
    }

    @Test
    public void test03(){
        assertEquals(28,TriangularNumber.solution(10));
    }
}
