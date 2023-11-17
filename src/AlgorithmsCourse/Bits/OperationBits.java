package AlgorithmsCourse.Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationBits {

    /**
     * Escribe una función en Java que tome un número entero no negativo como
     * entrada y cuente cuántos bits "1" hay en su representación binaria.
     * Debes implementar esta función sin usar métodos de librería o funciones de Java
     * que cuenten los bits, como Integer.bitCount().
     * * Puedes suponer que el número es un entero no negativo.
     */
    public static int countBits(int num){
        int bitCount = 0;
        for (int i = 0; i < 32; i++) {
            bitCount = (num & 1) == 1 ? bitCount+=1 : bitCount;
            num >>>= 1;
        }
        return bitCount;
    }
}

class OperationBitsTest{
    @Test
    public void countBitsTest(){
        assertEquals(2, OperationBits.countBits(5));
    }
}

