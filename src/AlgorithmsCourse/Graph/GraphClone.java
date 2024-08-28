package AlgorithmsCourse.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphClone {
    public class Node{
        public int value;
        public List<Node> neigthbors;
    }

    public Node cloneGraph(Node node){
        HashMap<Integer,Node> visitedMap = new HashMap<>();
        return clone(node,visitedMap);
    }

    /**  Graph's nodes
     *   a: b,c
     *   b: a
     *   c: a,d
     *   d: c
     */


    public Node clone(Node node, HashMap<Integer,Node> map){
        if(node == null) return null;

        if(map.containsKey(node.value)) return map.get(node.value);

        Node newNode = new Node();
        newNode.value = node.value;
        newNode.neigthbors = new ArrayList<>();

        map.put(newNode.value, newNode);
        for (Node n: node.neigthbors) {
            newNode.neigthbors.add(clone(n,map));
        }
        return newNode;
    }
}
