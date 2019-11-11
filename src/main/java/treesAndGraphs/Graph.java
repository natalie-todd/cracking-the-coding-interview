package treesAndGraphs;

import java.util.Arrays;

public class Graph {
    public Node[] nodes;

    public Graph(Node[] nodes) {
        this.nodes = nodes;
    }

    public Node[] getNodes() {
        return nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graph graph = (Graph) o;
        return Arrays.equals(nodes, graph.nodes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(nodes);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + Arrays.toString(nodes) +
                '}';
    }
}


