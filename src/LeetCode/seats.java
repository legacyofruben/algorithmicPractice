package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class seats {
    /**
     * You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
     * There is at least one empty seat, and at least one person sitting.
     * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
     * Return that maximum distance to the closest person.
     *          Example 1:
     * Input: seats = [1,0,0,0,1,0,1]
     * Output: 2
     * Explanation:
     * If Alex sits in the second open seat (i.e. seats[2]), then the closest person has distance 2.
     * If Alex sits in any other open seat, the closest person has distance 1.
     * Thus, the maximum distance to the closest person is 2.
     *      Example 2:
     * Input: seats = [1,0,0,0]
     * Output: 3
     * Explanation:
     * If Alex sits in the last seat (i.e. seats[3]), the closest person is 3 seats away.
     * This is the maximum distance possible, so the answer is 3.
     *          Example 3:
     * Input: seats = [0,1]
     * Output: 1
     *          Constraints:
     * 2 <= seats.length <= 2 * 104
     * seats[i] is 0 or 1.
     * At least one seat is empty.
     * At least one seat is occupied.
     */
    public static void print(int[] seats){
        for (int i:seats) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int solution(int[] seats){
        int countL;
        int countR ;
        int len = seats.length;
        int maxCount = 1;
        //print(seats);
        for (int i = 0; i < len; i++) {
            if(seats[i]==0){
                countL = 0;
                countR = 0;
                // for left
                for (int j = i-1; j >= 0 ; j--) {
                    if(seats[j]==0){
                        countL++;
                        continue;
                    }
                    if(seats[j]==1){
                        countL++;
                        break;
                    }

                }
                for (int j = i+1; j < len ; j++) {
                    if(seats[j]==0){
                        countR++;
                        continue;
                    }
                    if(seats[j]==1){
                        countR++;
                        break;
                    }
                }
                if((countL > 1 && countR > 1) || (countL == 0 && countR > 1) || (countR == 0 && countL > 1)){
                    maxCount = Math.max(maxCount, Math.max(countL,countR));
                }else{
                    maxCount = Math.max(maxCount,1);
                }

            }
        }
        return maxCount;
    }
}
class seatsTest{
    @Test
    public void solutionTest(){
        assertEquals(2,seats.solution(new int[]{1,0,0,0,1,0,1}));
        assertEquals(3,seats.solution(new int[]{1,0,0,0}));
        assertEquals(1,seats.solution(new int[]{0,1}));
    }
}
