package treesAndGraphs;

import sun.misc.Queue;

public class BreadthFirstSearch {

    public static void search(Node root) throws InterruptedException {
        Queue queue = new Queue();
        root.marked = true;
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node r = (Node) queue.dequeue();
            visit(r);
            for (Node n : root.adjacent
            )
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
        }
    }

    private static void visit(Node r) {
    }
}
