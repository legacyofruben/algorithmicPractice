package JavaConcept;

public class Pyramid {
    /**
     * How Many Rows You Want In Your Pyramid?
     * 9
     * Here Is Your Pyramid
     *          1
     *         2 2
     *        3 3 3
     *       4 4 4 4
     *      5 5 5 5 5
     *     6 6 6 6 6 6
     *    7 7 7 7 7 7 7
     *   8 8 8 8 8 8 8 8
     *  9 9 9 9 9 9 9 9 9
     */
    public static void main(String[] args) {
        int rows = 9;
        for (int i = 0; i < rows; i++) { // rows
            int start = (rows - (i+1))/2;
            for (int j = 0; j <= start+(i+1) ; j++) { //columns
                if(j>start){
                    System.out.print(i+1 + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
