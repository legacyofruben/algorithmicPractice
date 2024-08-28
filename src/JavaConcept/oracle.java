package JavaConcept;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class oracle {

    private static final int[] BILLS_VALUES = new int[] {100,50,20,10,5,2,1};
    public static int MakeChange(int amount){
        if(amount <= 0) return -1;
        int billsCount = 0;
        int b = (amount <= 10 ) ? BILLS_VALUES.length/2 : 0;
        for (; amount != 0; b++) {
            if((amount / BILLS_VALUES[b]) > 0){
                billsCount+= (amount / BILLS_VALUES[b]);
                amount %= BILLS_VALUES[b];
            }
        }
        return billsCount;
    }

    private static final List<Map<Integer,Integer>> BILLS_AVAILABLE = List.of(
            Map.of(100,5),
            Map.of(50,3),
            Map.of(20,2),
            Map.of(10,5),
            Map.of(5,6),
            Map.of(2,1),
            Map.of(1,10)
            );
    public int getAvailableChange(int purchaseAmount, int paymentAmount){
        if(purchaseAmount > paymentAmount) return -1;
        int change = paymentAmount - purchaseAmount;
        Map<Integer,Integer> changeBills = new HashMap<>();

        int count = 0;
/*        for (Map<Integer,Integer> value: BILLS_AVAILABLE) {
            count = change / value.get();
            *//*if(count > 0){
                changeBills.put(value,count);
                change %= value;
            }*//*
        }*/
        return changeBills.size();
    }
}
class oracleTest{
    @Test
    public void getChange(){
        oracle o = new oracle();
        assertEquals(2,oracle.MakeChange(7));
        assertEquals(2,oracle.MakeChange(55));
        assertEquals(4,oracle.MakeChange(255));
    }
}
