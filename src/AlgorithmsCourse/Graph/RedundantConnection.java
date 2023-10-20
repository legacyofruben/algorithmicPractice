package AlgorithmsCourse.Graph;

import java.util.*;

public class RedundantConnection {

    /**
     * Dado un grafo formado  tras añadir una arista entre dos nodos de un arbol,
     * devuelve la arista que puede ser eliminada para vovler a formar un arbol.
     *
     * En caso de exitir multiples soluciones, decuelve la ultima arista del input.
     *
     * Ejemplo 1:
     *  input:  [[1,2],[2,3],[2,3]]
     *  output: [2,3]
     *
     */
    public static int[] findRedundantConnection(int[][] edges){
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            adjList.add(new HashSet<>());
        }
        for (int[] edge: edges) {
            int first = edge[0];
            int second = edge[1];
            if(dfsFind(first,second,-1,adjList)) return edge;
            adjList.get(first).add(second);
            adjList.get(second).add(first);
        }
        return null;
    }

    private static boolean dfsFind(int first, int second, int previous ,List<Set<Integer>> adjList) {
        if(first==second) return true;
        for (int other: adjList.get(first)) {
            if(other == previous) continue;
            if(dfsFind(other,second,first,adjList)){
                return true;
            }
        }
        return false;
    }

}
