package AlgorithmsCourse.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildOrder {
    
    public static ArrayList<String> buildOrder(String[] projects, String[][]  dependencies){
        Graph graph = buildDependencyGraph(projects,dependencies);

        List<String> sortedProjects = new ArrayList<>();
        for(GraphNode node : graph.nodes.values()){
            depthFirstSearchProjects(node,sortedProjects);
        }
        Collections.reverse(sortedProjects);
        return (ArrayList<String>) sortedProjects;
    }

    private static void depthFirstSearchProjects(GraphNode node, List<String> sortedProjects) {
        if(node == null) return;

        if(node.status == GraphNodeStatus.Unvisited){
            node.status = GraphNodeStatus.Visiting;
            for (GraphNode n:node.adjacents.values()) {
                depthFirstSearchProjects(n,sortedProjects);
            }
            node.status = GraphNodeStatus.Visited;
            sortedProjects.add(node.value);
        }else{
            if(node.status == GraphNodeStatus.Visiting){
                throw new RuntimeException();
            }
        }
    }

    private static Graph buildDependencyGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();
        for (String p: projects) {
            graph.getOrCreateNode(p);
        }
        for (String[] dependency: dependencies) {
            graph.addEdge(dependency[0],dependency[1]);
        }
        
        return graph;
    }
}
