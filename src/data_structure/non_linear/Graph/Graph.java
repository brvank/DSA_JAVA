package data_structure.non_linear.Graph;

import data_structure.linear.LinkedList.LinkedList;
import data_structure.linear.LinkedList.Node;
import data_structure.linear.Queue.Queue;
import data_structure.linear.Stack.Stack;

import java.util.*;

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
        addVertex(to);
        while(temp != null){
            if(temp.getData().getData().getId().equals(from)){
                Node<NodeC<T, S>> llNodeC = temp.getData().getData().getEdges().getHead();
                while(llNodeC != null){
                    if(llNodeC.getData().getData().getTo().equals(to)){
                        llNodeC.getData().getData().setWeight(weight);
                        return;
                    }
                    llNodeC = llNodeC.getNext();
                }
                temp.getData().getData().getEdges().addLast(new NodeC<T, S>(new DataC<T, S>(to, weight)));
                return;
            }
            temp = temp.getNext();
        }

        NodeP<T, S> newNode = addVertex(from);
        newNode.getData().getEdges().addLast(new NodeC<T, S>(new DataC<T, S>(to, weight)));
    }

    public int getCountVertices(){
        return vertices.size();
    }

    public void dft(){
        //use of stack
        Set<T> visitedNodes = new HashSet<>();

        Node<NodeP<T, S>> temp = vertices.getHead();
        if(temp != null){
            Stack<T> stack = new Stack<>();
            stack.push(temp.getData().getData().getId());

            while(stack.size() > 0){
                T data = stack.getTop();
                visitedNodes.add(data);
                stack.pop();

                NodeP<T, S> tempNodeP = find(data);

                //perform action
                System.out.print(tempNodeP.getData().getId() + " ");

                //fill stack
                Node<NodeC<T, S>> tempNodeC = tempNodeP.getData().getEdges().getHead();
                while(tempNodeC != null){
                    if(visitedNodes.add(tempNodeC.getData().getData().getTo())){
                        stack.push(tempNodeC.getData().getData().getTo());
                    }
                    tempNodeC = tempNodeC.getNext();
                }
            }

        }
    }

    public void dft(T id){
        //use of stack
        Set<T> visitedNodes = new HashSet<>();

        NodeP<T, S> temp = find(id);
        if(temp != null){
            Stack<T> stack = new Stack<>();
            stack.push(temp.getData().getId());

            while(stack.size() > 0){
                T data = stack.getTop();
                visitedNodes.add(data);
                stack.pop();

                NodeP<T, S> tempNodeP = find(data);

                //perform action
                System.out.print(tempNodeP.getData().getId() + " ");

                //fill stack
                Node<NodeC<T, S>> tempNodeC = tempNodeP.getData().getEdges().getHead();
                while(tempNodeC != null){
                    if(visitedNodes.add(tempNodeC.getData().getData().getTo())){
                        stack.push(tempNodeC.getData().getData().getTo());
                    }
                    tempNodeC = tempNodeC.getNext();
                }
            }

        }
    }

    public void bft(){
        //use of queue
        Set<T> visitedNodes = new HashSet<>();

        Node<NodeP<T, S>> temp = vertices.getHead();
        if(temp != null){
            Queue<T> queue = new Queue<>();
            queue.enqueue(temp.getData().getData().getId());

            while(queue.size() > 0){
                T data = queue.getLast();
                visitedNodes.add(data);
                queue.dequeue();

                NodeP<T, S> tempNodeP = find(data);

                //perform action
                System.out.print(tempNodeP.getData().getId() + " ");

                //fill stack
                Node<NodeC<T, S>> tempNodeC = tempNodeP.getData().getEdges().getHead();
                while(tempNodeC != null){
                    if(visitedNodes.add(tempNodeC.getData().getData().getTo())){
                        queue.enqueue(tempNodeC.getData().getData().getTo());
                    }
                    tempNodeC = tempNodeC.getNext();
                }
            }

        }
    }

    public void bft(T id){
        //use of queue
        Set<T> visitedNodes = new HashSet<>();

        NodeP<T, S> temp = find(id);
        if(temp != null){
            Queue<T> queue = new Queue<>();
            queue.enqueue(temp.getData().getId());

            while(queue.size() > 0){
                T data = queue.getLast();
                visitedNodes.add(data);
                queue.dequeue();

                NodeP<T, S> tempNodeP = find(data);

                //perform action
                System.out.print(tempNodeP.getData().getId() + " ");

                //fill stack
                Node<NodeC<T, S>> tempNodeC = tempNodeP.getData().getEdges().getHead();
                while(tempNodeC != null){
                    if(visitedNodes.add(tempNodeC.getData().getData().getTo())){
                        queue.enqueue(tempNodeC.getData().getData().getTo());
                    }
                    tempNodeC = tempNodeC.getNext();
                }
            }

        }
    }

    public NodeP<T, S> find(T id){
        Node<NodeP<T, S>> temp = vertices.getHead();
        while(temp != null){
            if(temp.getData().getData().getId().equals(id)){
                return temp.getData();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void setVisitedState(VisitedState state){
        Node<NodeP<T, S>> temp = vertices.getHead();
        while(temp != null){
            temp.getData().getData().setVisitedState(state);
            temp.getData().setVisited(state);
            temp = temp.getNext();
        }
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

//TODO: algorithm to remove the vertex or edges

//test
/*
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

        graph.dft();
        System.out.println();
        graph.dft(3);
        System.out.println();

        graph.bft(4);
        System.out.println();
 */