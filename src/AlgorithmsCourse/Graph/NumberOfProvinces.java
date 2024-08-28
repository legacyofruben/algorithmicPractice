package AlgorithmsCourse.Graph;

public class NumberOfProvinces {
    /**
     *  A province is a conjunction of 1 or more cities that are connected
     *    a b c
     *  a 1 1 0
     *  b 1 1 0
     *  c 0 0 1
     * 
     * @param isConnected
     * @return numberOfProvinces
     */
    public static int numberOfProvinces(int[][] isConnected){
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if(!visited[i]){
                count++;
                dfs(isConnected,visited,i);
            }
        }
        return count;
    }

    private static void dfs(int[][] isConnected, boolean[] visited, int city) {
        for (int other = 0; other < isConnected[0].length; other++) {
            if(other != city && isConnected[city][other] == 1 && !visited[other]){
                visited[other] = true;
                dfs(isConnected,visited,other);
            }
        }
    }



}
