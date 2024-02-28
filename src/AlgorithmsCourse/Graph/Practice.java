package AlgorithmsCourse.Graph;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Practice {

    public static boolean existConn(List<int[]> conn, int start, int end){
        Set<int[]> conns = new HashSet<>(conn);
        if(conns.contains(new int[]{start,end}) ||
        conns.contains(new int[]{end,start})){
            return true;
        }
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> tail = new LinkedList<>();
        tail.offer(start);
        while(!tail.isEmpty()){
            int curr = tail.poll();
            visited.add(curr);
            for (int[] c: conns) {
                if (c[0]==curr || c[1]==curr) {
                    int anotherCity = c[0]==curr ? c[1] : c[0];
                    if(end == anotherCity){
                        return true;
                    }
                    else if(!visited.contains(anotherCity)){
                        tail.offer(anotherCity);
                    }

                }
            }
        }
        return false;
    }
}
class PracticeTest{
    @Test
    public void existConnTest(){
        List<int[]> cities = List.of(
                new int[]{1,2},
                new int[]{2,3},
                new int[]{3,4}
                );
        assertTrue(Practice.existConn(cities,1,4));
    }
}
