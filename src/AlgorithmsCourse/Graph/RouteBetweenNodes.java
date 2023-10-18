package AlgorithmsCourse.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {
    /**
     * Directed graph (only one route with direction between nodes)
     *   0      1   <-   4
     *          ^        |
     *          |        v
     *          2   <-   3
     * Adjacent matrix
     *     | 0 | 1 | 2 | 3 | 4
     *   0 | 0   0   0   0   0
     *   1 | 0   0   0   0   0
     *   2 | 0   1   0   0   0
     *   3 | 0   0   1   0   0
     *   4 | 0   1   0   1   0
     */
    public boolean isRouteBetween(Graph graph, GraphNode start, GraphNode end){
        if(start == end) return true;
        Queue<GraphNode> queue =  new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            GraphNode next = queue.remove();
            if(end == next) return true;
            for (GraphNode node: next.adjacents.values()) {
                if(!node.status.equals(GraphNodeStatus.Visited))
                {
                    queue.add(node);
                    node.status = GraphNodeStatus.Visited;
                }
            }
        }

        return false;
    }
}
