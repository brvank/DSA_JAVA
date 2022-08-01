package algorithm.sorting;

import data_structure.linear.LinkedList.LinkedList;

import java.util.ArrayList;

public class QuickSort<T> extends Sort<T>{

    public QuickSort(Comparator<T> comparator){
        super(comparator);
    }

    @Override
    public int sort(ArrayList<T> arrayList) {
        try{
            //algorithm
            quickSort(arrayList, 0, arrayList.size()-1);
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    private void quickSort(ArrayList<T> arrayList, int left, int right){
        if(left < right){
            int p = partition(arrayList, left, right);

            quickSort(arrayList, left, p);
            quickSort(arrayList, p+1, right);
        }
    }

    private int partition(ArrayList<T> arrayList, int left, int right){
        T data = arrayList.get(right);

        int i = left - 1;

        for(int j=left;j<right;j++){
            if(comparator.compare(data, arrayList.get(j))){
                i++;
                T d1 = arrayList.get(i);
                T d2 = arrayList.get(j);
                arrayList.set(i, d2);
                arrayList.set(j, d1);
            }
        }

        T d = arrayList.get(i+1);
        arrayList.set(right, d);
        arrayList.set(i+1, data);

        return i;
    }

    @Override
    public int sort(LinkedList<T> linkedList) {
        try{
            //algorithm
            quickSort(linkedList, 0, linkedList.size()-1);
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    private void quickSort(LinkedList<T> linkedList, int left, int right){
        if(left < right){
            int p = partition(linkedList, left, right);

            quickSort(linkedList, left, p);
            quickSort(linkedList, p+1, right);
        }
    }

    private int partition(LinkedList<T> linkedList, int left, int right){
        T data = linkedList.get(right);

        int i = left - 1;

        for(int j=left;j<right;j++){
            if(comparator.compare(data, linkedList.get(j))){
                i++;
                T d1 = linkedList.get(i);
                T d2 = linkedList.get(j);
                linkedList.set(i, d2);
                linkedList.set(j, d1);
            }
        }

        T d = linkedList.get(i+1);
        linkedList.set(right, d);
        linkedList.set(i+1, data);

        return i;
    }
}
