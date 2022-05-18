package data_structure.non_linear.GraphAdj;

public class GraphAdj<T> {
    private int vertices;
    private Node<T>[] nodes;

    public GraphAdj(int vertices){
        this.vertices = vertices;
        nodes = new Node[vertices];
    }

    public void addEdge(int from, int to, T data){
        if(nodes[from] == null){
            Node<T> node = new Node<T>(data, to);
            nodes[from] = node;
        }else{
            Node<T> temp = nodes[from];
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            Node<T> temp2 = new Node<T>(data, to);
            temp.setNext(temp2);
        }
    }

    //TODO: implement dfs and bfs algorithms

    public int getCountVertices(){
        return this.vertices;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<vertices;i++){
            Node<T> temp = nodes[i];
            stringBuilder.append(i).append("==>");
            if(temp != null){
                while(temp != null){
                    stringBuilder.append(temp.getTo()).append("(").append(temp.getData()).append(")");
                    temp = temp.getNext();
                    if(temp != null){
                        stringBuilder.append(", ");
                    }
                }
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }
}
