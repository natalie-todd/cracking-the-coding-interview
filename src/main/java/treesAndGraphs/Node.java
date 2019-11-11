package treesAndGraphs;

import java.util.Arrays;
import java.util.Objects;

public class Node {
    public Node[] adjacent;
    public boolean visited = false;
    public String name;
    public boolean marked = false;
    public boolean state = false;
    public Node[] children;

    public Node(String name, boolean visited, boolean marked, boolean state, Node[] children, Node[] adjacent) {
        this.name = name;
        this.visited = visited;
        this.marked = marked;
        this.state = state;
        this.children = children;
        this.adjacent = adjacent;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isMarked() {
        return marked;
    }

    public boolean isState() {
        return state;
    }

    public Node[] getChildren() {
        return children;
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return visited == node.visited &&
                marked == node.marked &&
                state == node.state &&
                Objects.equals(name, node.name) &&
                Arrays.equals(children, node.children) &&
                Arrays.equals(adjacent, node.adjacent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, visited, marked, state);
        result = 31 * result + Arrays.hashCode(children);
        result = 31 * result + Arrays.hashCode(adjacent);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", visited=" + visited +
                ", marked=" + marked +
                ", state=" + state +
                ", children=" + Arrays.toString(children) +
                ", adjacent=" + Arrays.toString(adjacent) +
                '}';
    }
}
