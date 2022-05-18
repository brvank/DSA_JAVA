package data_structure.non_linear.Graph;

import data_structure.linear.LinkedList.LinkedList;

/**
 @author ankit maurya
 @param <T> data type for id of vertex
 @param <S> data type for weight of edge
 */
public class NodeP<T, S> {
    private DataP<T, S> data;
    private NodeP<T, S> next;

    public NodeP(DataP<T, S> data) {
        this.data = data;
        this.next = null;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<edges.length();i++){
            stringBuilder.append(edges.get(i).getData().toString());
            if(i < edges.length() -1){
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
