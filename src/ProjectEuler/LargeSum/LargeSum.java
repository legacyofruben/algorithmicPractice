package ProjectEuler.LargeSum;

public class LargeSum {

    static public String solution(String numbers) {
        int[][] matrix = new int[numbers.split("\n").length][numbers.split("\n")[0].length()];

        int row = 0, col = 0;
        for (String _row : numbers.split("\n")){
            //System.out.println(_row);
            for (char c : _row.toCharArray()){
                //System.out.println(c);
                matrix[row][col++] = Integer.parseInt(String.valueOf(c));
                col = col > matrix[row].length-1 ? 0 : col;
            }
            row++;
            row = row > matrix.length-1 ? 0 : row;

        }

        System.out.println("Matrix");
        for (int[] ints : matrix) {
            for (int i : ints){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("________________________");
        long sum = 0;
        long carry = 0;
        StringBuilder result = new StringBuilder();
        String tmp = "";
        for (int i = matrix[0].length-1; i >= 0 ; i--) {
            for (int[] ints : matrix) {
                //System.out.println(ints[i]);
                sum+=ints[i];
            }
            tmp = String.valueOf(sum);
            result.insert(0,
                    (i-1) < 0 ? tmp : tmp.charAt(tmp.length()-1)
                    );
            carry = Long.parseLong(tmp.substring(0,tmp.length()-1));
            System.out.println(tmp + " digit: " + tmp.charAt(tmp.length()-1) + " carry: " + carry + " result: " + result);
            sum = carry;
        }

        return result.length() > 5 ? result.substring(0,10) : result.toString();
    }
}
