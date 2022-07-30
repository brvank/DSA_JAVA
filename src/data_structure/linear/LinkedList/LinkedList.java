package data_structure.linear.LinkedList;

public class LinkedList<T>{
    private Node<T> head;
    private int count;

    public LinkedList(){
        head = null;
        count = 0;
    }

    //add
    public T add(T data){
        return addFront(data);
    }

    public T addFront(T data){
        if(head == null){
            head = new Node<>(data);
        }else{
            Node<T> temp = new Node<>(data);
            temp.setNext(head);
            head = temp;
        }
        count++;
        return data;
    }

    public T addLast(T data){
        if(head == null){
            head = new Node<>(data);
        }else{
            Node<T> temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node<>(data));
        }
        count++;
        return data;
    }

    public T addAt(int index, T data){
        if(index >= 0 && index < count){
            if(index == 0){
                addFront(data);
            }else if(index == count-1){
                addLast(data);
            }else{
                Node<T> temp = head;
                while(index > 1){
                    temp = temp.getNext();
                    index--;
                }
                Node<T> temp2 = new Node<T>(data);
                temp2.setNext(temp.getNext());
                temp.setNext(temp2);
                count++;
            }
            return data;
        }
        return null;
    }

    public Node<T> getHead(){
        return head;
    }

    //get
    public T getFront(){
        if(head == null) return null;
        return head.getData();
    }

    public T getLast(){
        if(head == null) return null;
        Node<T> temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public T get(int index){
        if(index >= 0 && index < count){
            if(index == 0){
                return getFront();
            }else if(index == count -1){
                return getLast();
            }else{
                Node<T> temp = head;
                while(index>0){
                    temp = temp.getNext();
                    index--;
                }
                return temp.getData();
            }
        }else{
            return null;
        }
    }

    //edit
    public void set(int index, T data){
        if(index >= 0 && index < count){
            Node<T> temp = head;
            while(index>0){
                temp = temp.getNext();
                index--;
            }
            temp.setData(data);
        }
    }

    //remove
    public void removeFront(){
        if(head != null){
            Node<T> temp = head;
            head = temp.getNext();
            temp = null;
            count--;
        }
    }

    public void removeLast(){
        if(head != null){
            if(count == 1){
                head = null;
            }else{
                Node<T> temp = head;
                Node<T> temp2 = null;
                while (temp.getNext() != null){
                    temp2 = temp;
                    temp = temp.getNext();
                }
                if(temp2 != null){
                    temp2.setNext(null);
                }
                temp = null;
                count--;
            }
        }
    }

    public void removeFrom(int index){
        if(index >= 0 && index < count){
            if(index == 0){
                removeFront();
            }else if(index == count -1){
                removeLast();
            }else{
                Node<T> temp = head;
                while(index > 1){
                    temp = temp.getNext();
                    index--;
                }
                Node<T> temp2 = temp.getNext();
                if(temp2 != null){
                    temp.setNext(temp2.getNext());
                }else{
                    temp.setNext(null);
                }
                count--;
            }
        }
    }

    public void remove(T data){
        Node<T> temp = head;
        int index = 0;
        while(temp != null){
            if(temp.getData().equals(data)){
                removeFrom(index);
                return;
            }
            index++;
            temp = temp.getNext();
        }
    }

    public int length(){
        return count;
    }

    //to string
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        if(head == null){
            return "[]";
        }else{
            stringBuilder.append("[");
            Node<T> temp = head;
            while(temp.getNext() != null){
                stringBuilder.append(temp.getData()).append(", ");
                temp = temp.getNext();
            }
            stringBuilder.append(temp.getData());
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

//test
/*
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(11);
        linkedList.addLast(12);
        linkedList.addLast(13);
        linkedList.addLast(14);
        linkedList.addLast(15);
        linkedList.addLast(16);
        System.out.println(linkedList);
        linkedList.remove(10);
        System.out.println(linkedList);
        linkedList.remove(13);
        System.out.println(linkedList);
 */
