package data_structure.non_linear.Graph;

class Node<T> {
    private T data;
    private int to;
    private Node<T> next;

    public Node(T data, int to) {
        this.data = data;
        this.to = to;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
