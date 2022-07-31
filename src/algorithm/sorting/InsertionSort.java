package algorithm.sorting;

import data_structure.linear.LinkedList.LinkedList;

import java.util.ArrayList;

public class InsertionSort<T> extends Sort<T>{

    public InsertionSort(Comparator<T> comparator) {
        super(comparator);
    }

    @Override
    public int sort(ArrayList<T> arrayList) {
        try{
            for(int i=0;i<arrayList.size();i++){
                T key = arrayList.get(i);
                int j = i-1;
                while(j>=0 && comparator.compare(key, arrayList.get(j))){
                    arrayList.set(j+1, arrayList.get(j));
                    j--;
                }
                arrayList.set(j+1, key);
            }
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    @Override
    public int sort(LinkedList<T> linkedList) {
        try{
            for(int i=0;i<linkedList.length();i++){
                T key = linkedList.get(i);
                int j = i-1;
                while(j>=0 && comparator.compare(key, linkedList.get(j))){
                    linkedList.set(j+1, linkedList.get(j));
                    j--;
                }
                linkedList.set(j+1, key);
            }
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
