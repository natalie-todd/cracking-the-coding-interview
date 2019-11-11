package treesAndGraphs;

import sun.misc.Queue;

//given directed graph, design an algirthm to find out whether there is a route between two nodes
public class RouteBetweenNodes {
    public static Node rox = new Node("rox", false, false, false,null, null);
    public static Node charles = new Node("charles", false, false, false,null,  new Node[] {rox });
    public static Node zen = new Node("zen", false, false, false,null, new Node[] {charles });
    public static Node[] catArr = new Node[]{ rox, charles, zen };
    public static Graph gg = new Graph(catArr);

    private static boolean isThereARoute(Graph graph, Node node1, Node node2) throws InterruptedException {

        if (node1 == node2) {
            return true;
        }

        Queue queue = new Queue();


        for (Node n : graph.getNodes()
        ) {
            n.visited = false;
        }
        node1.visited = true;
        queue.enqueue(node1);
        Node u;

        try {
            while (!queue.isEmpty()) {
                u = (Node) queue.dequeue();
                if (u != null) {
                    for (Node n : u.adjacent
                    )
                        if (n.visited == false) {
                            if (n == node2) {
                                node2.visited = true;
                            } else {
                                queue.enqueue(n);
                            }
                        }
                }
            }
        } catch(Exception e) {
            return false;
        }
        return node2.visited;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(isThereARoute(gg, charles, rox));
    }
}
