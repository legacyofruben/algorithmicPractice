package ProjectEuler.LargeSum;

public class LargeSum {

    static public String solution(int[] numbers) {
        int[][] matrix = new int[100][50];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = numbers[index];
                index++;
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print( matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("___________________________________________________________________________");
        int sum = 0;
        int carry = 0;
        StringBuilder sumTotal= new StringBuilder();
        System.out.println("Sum");
        for (int j = matrix[0].length-1; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                sum+=matrix[i][j];
                sum = carry == 0 ? sum : (sum+carry);
            }
            StringBuilder tmp = new StringBuilder( String.valueOf(sum));
            sumTotal.insert(0,tmp.substring(tmp.length()-1));
            carry = tmp.length() > 1 ? Integer.parseInt(tmp.substring(0,tmp.length()-1)) : 0;
//            System.out.println("sum: " + sum);
//            System.out.println("sumTotal: " + sumTotal);
//            System.out.println("carry: " + carry);
        }
        if (carry > 0){
            sumTotal.insert(0,String.valueOf(carry));
        }

        System.out.println("sumTotal: " + sumTotal);

        return sumTotal.substring(0,10);
    }
}
