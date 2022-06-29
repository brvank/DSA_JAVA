package data_structure.non_linear.Graph;

import data_structure.linear.LinkedList.LinkedList;
import data_structure.linear.LinkedList.Node;

/**
 <B>0 based indexing</B>
 @author ankit maurya
 @param <T> data type for id of vertex
 @param <S> data type for weight of edge
 */
public class Graph<T, S> {
    private LinkedList<NodeP<T, S>> vertices;

    public Graph() {
        vertices = new LinkedList<NodeP<T, S>>();
    }

    public LinkedList<NodeP<T, S>> getVertices() {
        return vertices;
    }

    public NodeP<T, S> addVertex(T id){
        Node<NodeP<T, S>> temp = vertices.getHead();
        while(temp != null){
            if(temp.getData().getData().getId() == id){
                return temp.getData();
            }
            temp = temp.getNext();
        }

        NodeP<T, S> newNode = vertices.addLast(new NodeP<T, S>(new DataP<T, S>(id)));
        return newNode;
    }

    public void addEdge(T from, T to, S weight){
        Node<NodeP<T, S>> temp = vertices.getHead();
        while(temp != null){
            if(temp.getData().getData().getId().equals(from)){
                temp.getData().getData().getEdges().addLast(new NodeC<T, S>(new DataC<T, S>(to, weight)));
                return;
            }
            temp = temp.getNext();
        }

        NodeP<T, S> newNode = addVertex(from);
        newNode.getData().getEdges().addLast(new NodeC<T, S>(new DataC<T, S>(to, weight)));
    }

    public int getCountVertices(){
        return vertices.length();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node<NodeP<T, S>> temp = vertices.getHead();
        while(temp != null){
            DataP<T, S> tempDataP = temp.getData().getData();
            stringBuilder.append(tempDataP.getId()).append("==>").append(tempDataP.toString());
            stringBuilder.append("\n");

            temp = temp.getNext();
        }

        return stringBuilder.toString();
    }
}
