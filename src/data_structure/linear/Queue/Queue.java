package data_structure.linear.Queue;

public class Queue<T> {
    Node<T> front, last;
    int count;

    public Queue(){
        front = null;
        last = null;
        count = 0;
    }

    public void enqueue(T data){
        if(front == null){
            front = new Node<T>(data);
            last = front;
        }else{
            Node<T> temp = new Node<T>(data);
            temp.setNext(front);
            front = temp;
        }
        count++;
    }

    public void dequeue(){
        if(front != null){
            Node<T> temp = front;
            while(temp.getNext() != null && temp.getNext() != last){
                temp = temp.getNext();
            }
            if(temp.getNext() == null){
                temp = null;
                front = null;
                last = null;
            }else{
                temp.setNext(null);
                last = temp;
            }
            count--;
        }
    }

    public T getFront(){
        if(front == null){
            return null;
        }else{
            return front.getData();
        }
    }

    public T getLast(){
        if(last == null){
            return null;
        }else{
            return last.getData();
        }
    }

    public int length(){
        return count;
    }

    //to string
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        if(front == null){
            return "";
        }else{
            Node<T> temp = front;
            while(temp.getNext() != null){
                stringBuilder.append(temp.getData()).append(", ");
                temp = temp.getNext();
            }
            stringBuilder.append(temp.getData());
            return stringBuilder.toString();
        }
    }
}

//test
/*
        Queue<Integer> queue = new Queue<>();
        System.out.println("start");
        System.out.println(queue.length());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.enqueue(23);
        System.out.println(queue.toString());
        queue.enqueue(3);
        System.out.println(queue.toString());
        queue.enqueue(5);
        System.out.println(queue.toString());
        queue.enqueue(43);
        System.out.println(queue.toString());
        queue.enqueue(67);
        System.out.println(queue.toString());
        queue.enqueue(87);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.enqueue(546);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        System.out.println("end");
 */
