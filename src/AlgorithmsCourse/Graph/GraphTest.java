package AlgorithmsCourse.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {

    @Test
    public void routeBetweenNodesTest(){
        RouteBetweenNodes routeBetweenNodes = new RouteBetweenNodes();
        Graph graph = new Graph();
        GraphNode node0 = graph.getOrCreateNode("0");
        GraphNode node1 = graph.getOrCreateNode("1");
        GraphNode node3 = graph.getOrCreateNode("3");
        GraphNode node4 = graph.getOrCreateNode("4");
        GraphNode node6 = graph.getOrCreateNode("6");

        graph.addEdge("0","1");
        graph.addEdge("1","2");
        graph.addEdge("2","0");
        graph.addEdge("2","3");
        graph.addEdge("3","2");
        graph.addEdge("4","6");
        graph.addEdge("5","4");
        graph.addEdge("6","5");

        assertTrue(routeBetweenNodes.isRouteBetween(graph,node1,node0));
        assertTrue(routeBetweenNodes.isRouteBetween(graph,node0,node1));
        assertTrue(routeBetweenNodes.isRouteBetween(graph,node6,node4));
    }


}
