package data_structure.non_linear.Graph;

import data_structure.linear.LinkedList.LinkedList;

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

    public void addVertex(T id){
        vertices.addLast(new NodeP<T, S>(new DataP<T, S>(id)));
    }

    public void addEdge(T from, T to, S weight){
        NodeP<T, S> temp = vertices.getFront();
        while(temp != null){
            if(temp.getData().getId().equals(from)){
                temp.getData().getEdges().addLast(new NodeC<T, S>(new DataC<T, S>(to, weight)));
                return;
            }
            temp = temp.getNext();
        }
        temp = vertices.getLast();
        NodeP<T, S> newNode = vertices.addLast(new NodeP<T, S>(new DataP<T, S>(from)));
        newNode.getData().getEdges().addLast(new NodeC<T, S>(new DataC<T, S>(to, weight)));
        temp.setNext(newNode);
    }

    public int getCountVertices(){
        int len = 0;
        NodeP<T, S> tempNodeP = vertices.getFront();
        while(tempNodeP != null){
            len++;
            tempNodeP = tempNodeP.getNext();
        }
        return vertices.length();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        NodeP<T, S> tempNodeP = vertices.getFront();
        while(tempNodeP != null){
            DataP<T, S> tempDataP = tempNodeP.getData();
            stringBuilder.append(tempDataP.getId()).append("==>").append(tempDataP.toString());
            stringBuilder.append("\n");
            tempNodeP = tempNodeP.getNext();
            System.out.println("adding");
        }

        return stringBuilder.toString();
    }
}
