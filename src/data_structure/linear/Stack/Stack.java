package data_structure.linear.Stack;

public class Stack<T> {
    private Node<T> top;
    private int count;

    public Stack(){
        top = null;
        count = 0;
    }

    public void push(T data){
        if(top == null){
            top = new Node<T>(data);
        }else{
            Node<T> temp = new Node<T>(data);
            temp.setNext(top);
            top = temp;
        }
        count++;
    }

    public void pop(){
        if(top != null){
            Node<T> temp = top;
            top = temp.getNext();
            temp = null;
            count--;
        }
    }

    public T getTop(){
        if(top == null){
            return null;
        }else{
            return top.getData();
        }
    }

    public int length(){
        return count;
    }

    //to string
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        if(top == null){
            return "";
        }else{
            Node<T> temp = top;
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
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("start");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.getTop());
        stack.push(23);
        System.out.println(stack.toString());
        stack.push(3);
        System.out.println(stack.toString());
        stack.push(5);
        System.out.println(stack.toString());
        stack.push(43);
        System.out.println(stack.toString());
        stack.push(67);
        System.out.println(stack.toString());
        stack.push(87);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.push(546);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("end");
 */
