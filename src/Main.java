import data_structure.non_linear.Graph.Graph;
import data_structure.non_linear.GraphAdj.GraphAdj;

public class Main {
    public static void main(String[] args) {

        GraphAdj<Integer> graphAdj = new GraphAdj<>(5);

        graphAdj.addEdge(0,1,1);
        graphAdj.addEdge(0,3,1);
        graphAdj.addEdge(1,2,1);
        graphAdj.addEdge(1,3,1);
        graphAdj.addEdge(1,4,1);
        graphAdj.addEdge(2,0,1);
        graphAdj.addEdge(3,2,1);
        graphAdj.addEdge(4,3,1);

        System.out.println(graphAdj.toString());


        Graph<Integer, Integer> graph = new Graph<>();
        graph.addEdge(0,1,1);
        graph.addEdge(0,2,1);
        graph.addEdge(1,2,1);
        graph.addEdge(2,3,1);
        graph.addEdge(2,4,1);
        graph.addEdge(3,2,1);
        graph.addEdge(4,1,1);
        graph.addEdge(4,3,1);

        System.out.println(graph.getCountVertices());
        for(int i=0;i<7;i++)
        System.out.println(graph.getVertices().get(i).toString());

        System.out.println(graph.toString());

    }
}
