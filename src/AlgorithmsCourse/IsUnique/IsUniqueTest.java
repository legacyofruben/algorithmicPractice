package AlgorithmsCourse.IsUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsUniqueTest {
    @Test
    public void isUniqueTest(){
        assertTrue(IsUnique.isUnique("abcde"));
        assertTrue(IsUnique.isUnique("ACBDEabcde"));
        assertFalse(IsUnique.isUnique("abcded"));

    }
}
