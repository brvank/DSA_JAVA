import data_structure.linear.LinkedList.LinkedList;
import data_structure.non_linear.Graph.Graph;
import data_structure.non_linear.GraphAdj.GraphAdj;


public class Main {
    public static void main(String[] args) {

        Graph<Integer, Integer> graph = new Graph<>();
        graph.addVertex(0);
        graph.addEdge(0,2,1);
        graph.addEdge(0,1,1);
        graph.addVertex(1);
        graph.addEdge(1,2,1);
        graph.addVertex(2);
        graph.addVertex(2);
        graph.addEdge(2,3,1);
        graph.addEdge(2,4,1);
        graph.addVertex(3);
        graph.addEdge(3,2,1);
        graph.addEdge(4,1,1);
        graph.addEdge(4,3,1);

        System.out.println(graph);

        graph.dft(3);

        graph.bft(4);

    }
}
