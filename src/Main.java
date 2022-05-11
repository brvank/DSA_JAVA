import data_structure.linear.Queue.Queue;
import data_structure.linear.Stack.Stack;
import data_structure.non_linear.Graph.Graph;

public class Main {
    public static void main(String[] args) {

        Graph<Integer> graph = new Graph<>(5);

        graph.addEdge(0,1,1);
        graph.addEdge(0,3,1);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,1);
        graph.addEdge(1,4,1);
        graph.addEdge(2,0,1);
        graph.addEdge(3,2,1);
        graph.addEdge(4,3,1);

        System.out.println(graph.toString());

    }
}
