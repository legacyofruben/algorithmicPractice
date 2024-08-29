package ProjectEuler.Multiples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Multiples {

    public static int solution(int limit) {
        int count = 0;
        while (limit-- > 0) {
            if ((limit % 3) == 0 || (limit % 5) == 0) {
                count += limit;
                //System.out.println(limit);
            }
        }
        return count;
    }
}

class MultiplesTest {
    @Test
    public void test_01() {
        assertEquals(23, Multiples.solution(10));
    }

    @Test
    public void test_02() {
        assertEquals(233168, Multiples.solution(1000));
    }
}