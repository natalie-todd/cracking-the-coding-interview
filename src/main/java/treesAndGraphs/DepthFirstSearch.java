package treesAndGraphs;

public class DepthFirstSearch {

    public static void search(Node root) {
        if (root == null) {
            return;
        }
        visit(root);
        root.visited = true;

        for (Node n : root.adjacent
             ) if (n.visited == false){
                search(n);
        }
    }

    public static void visit(Node root) {
    }
}
    

