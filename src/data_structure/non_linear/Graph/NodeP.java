package data_structure.non_linear.Graph;

import data_structure.linear.LinkedList.LinkedList;
import data_structure.linear.LinkedList.Node;

/**
 @author ankit maurya
 @param <T> data type for id of vertex
 @param <S> data type for weight of edge
 */
public class NodeP<T, S> {
    private DataP<T, S> data;
    private NodeP<T, S> next;
    private VisitedState visited;

    public NodeP(DataP<T, S> data) {
        this.data = data;
        this.next = null;
        this.visited = VisitedState.NOT_VISITED;
    }

    public DataP<T, S> getData() {
        return data;
    }

    public void setData(DataP<T, S> data) {
        this.data = data;
    }

    public NodeP<T, S> getNext() {
        return next;
    }

    public void setNext(NodeP<T, S> next) {
        this.next = next;
    }

    public VisitedState getVisited() {
        return visited;
    }

    public void setVisited(VisitedState visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

/**
 @author ankit maurya
 @param <T> data type for id of vertex
 @param <S> data type for weight of edge
 */
class DataP<T, S> {
    private T id;
    private LinkedList<NodeC<T, S>> edges;

    public DataP(T id) {
        this.id = id;
        this.edges = new LinkedList<NodeC<T, S>>();
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public LinkedList<NodeC<T, S>> getEdges() {
        return edges;
    }

    public void setEdges(LinkedList<NodeC<T, S>> edges) {
        this.edges = edges;
    }

    public void setVisitedState(VisitedState state) {
        Node<NodeC<T, S>> temp = edges.getHead();
        while(temp != null){
            temp.getData().getData().setVisited(state);
            temp = temp.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<NodeC<T, S>> temp = edges.getHead();
        while(temp != null){
            NodeC<T, S> tempNodeC = temp.getData();
            stringBuilder.append(tempNodeC.getData().toString());
            temp = temp.getNext();
            if(temp != null){
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
