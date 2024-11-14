package ProjectEuler.SumSquareDif;


public class SumSquareDif {

    public static long solution (long range){
        long sumWithSquare=0;
        long sumNumbers=0;
        while(range > 0){
            sumNumbers+=range;
            sumWithSquare+=range*range--;
        }
        sumNumbers=sumNumbers*sumNumbers;
        System.out.println(sumNumbers + "-" + sumWithSquare);
        return sumNumbers - sumWithSquare;
    }
}
