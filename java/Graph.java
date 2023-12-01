import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    List<String> nodes;
    Map<String, List<String>> adjList;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.adjList = new HashMap<>();
    }

    public void addNode(String node) {
        this.nodes.add(node);
        this.adjList.put(node, new ArrayList<>());
    }

    public void addEdge(String node1, String node2) {
        this.adjList.get(node1).add(node2);
        this.adjList.get(node2).add(node1);
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");

        // Additional operations or prints can be added here

        System.out.println(graph.adjList);
    }
}
