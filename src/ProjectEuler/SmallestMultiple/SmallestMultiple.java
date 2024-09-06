package ProjectEuler.SmallestMultiple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestMultiple {

    public static boolean recursive (int number, int begin ,int limit){
        boolean reminder = (number % begin) == 0;
        if(!reminder){
            return false;
        }
        if(begin != limit) {
            return recursive(number, begin+1, limit);
        }
        return true;
    }

    public static int solution(int[] range){
        int number = range[1];
        while (!recursive(number, range[0], range[1])){
            //System.out.println(number + " ");
            number++;
        }
        return number;
    }
}
