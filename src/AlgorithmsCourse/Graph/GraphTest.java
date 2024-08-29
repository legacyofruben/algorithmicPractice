package AlgorithmsCourse.Graph;

import AlgorithmsCourse.Graph.GraphClone.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void cloneGraphTest(){
        /**  Graph's nodes
         *   1: 2,3
         *   2: 3
         *   3: 4
         *   4: 2
         */
        GraphClone graphClone = new GraphClone();
        Node node1 = graphClone.new Node();
        node1.value = 1;
        Node node2 = graphClone.new Node();
        node2.value = 2;
        Node node3 = graphClone.new Node();
        node3.value = 3;
        Node node4 = graphClone.new Node();
        node4.value = 4;

        node1.neigthbors = List.of(node2,node3);
        node2.neigthbors = List.of(node3);
        node3.neigthbors = List.of(node4);
        node4.neigthbors = List.of(node2);

        GraphClone.Node clonedNode1 = graphClone.cloneGraph(node1);

        assertEquals(1,clonedNode1.value);
        assertNotEquals(node1,clonedNode1);
    }

    @Test
    public void buildOrderTest(){

        String[] projects = {"a","b","c","d"};
        String[][] dependencies = {
                {"a","b"},
                {"a","c"},
                {"a","d"},
                {"c","b"},
                {"d","b"},
                {"d","c"}
        };

        List<String> result = BuildOrder.buildOrder(projects,dependencies);
        assertEquals(
                List.of("a","d","c","b"),
                result);
    }

    @Test
    public void numberOfProvincesTest(){
        int[][] first = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        assertEquals(2, NumberOfProvinces.numberOfProvinces(first));
        int[][] second = {
                {1,0,0},
                {1,1,0},
                {0,0,1}
        };
        assertEquals(3, NumberOfProvinces.numberOfProvinces(second));
    }
    @Test
    public void redundantConnectionTest(){
        int[][] first = {
                {1,2},
                {1,3},
                {2,3}
        };
        assertArrayEquals(
                new int[]{2,3},
                RedundantConnection.findRedundantConnection(first));
    }


}
