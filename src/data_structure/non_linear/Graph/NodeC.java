package data_structure.non_linear.Graph;

/**
 @author ankit maurya
 @param <T> data type for id of vertex
 @param <S> data type for weight of edge
 */
public class NodeC<T, S> {
    private DataC<T, S> data;
    private NodeC<T, S> next;

    public NodeC(DataC<T, S> data) {
        this.data = data;
        this.next = null;
    }

    public DataC<T, S> getData() {
        return data;
    }

    public void setData(DataC<T, S> data) {
        this.data = data;
    }

    public NodeC<T, S> getNext() {
        return next;
    }

    public void setNext(NodeC<T, S> next) {
        this.next = next;
    }
}

/**
 @author ankit maurya
 @param <T> data type for id of vertex
 @param <S> data type for weight of edge
 */
class DataC<T,S> {
    private T to;
    private S weight;
    private VisitedState visited;

    public DataC(T to, S weight) {
        this.to = to;
        this.weight = weight;
        this.visited = VisitedState.NOT_VISITED;
    }

    public T getTo() {
        return to;
    }

    public void setTo(T to) {
        this.to = to;
    }

    public S getWeight() {
        return weight;
    }

    public void setWeight(S weight) {
        this.weight = weight;
    }

    public VisitedState getVisited() {
        return visited;
    }

    public void setVisited(VisitedState visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return to.toString() + "(" + weight.toString() + ")";
    }
}