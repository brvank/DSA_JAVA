package algorithm.sorting;

import data_structure.linear.LinkedList.LinkedList;

import java.util.ArrayList;

public class SelectionSort<T> extends Sort<T>{

    public SelectionSort(Comparator<T> comparator){
        super(comparator);
    }

    @Override
    public int sort(ArrayList<T> arrayList) {
        try{
            for(int i=0;i<arrayList.size();i++){
                int min = i;
                for(int j=i+1;j<arrayList.size();j++){
                    if(comparator.compare(arrayList.get(min), arrayList.get(j))){
                        min = j;
                    }
                }
                if(min != i){
                    T d1 = arrayList.get(min);
                    T d2 = arrayList.get(i);
                    arrayList.set(min, d2);
                    arrayList.set(i, d1);
                }
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
                int min = i;
                for(int j=i+1;j<linkedList.length();j++){
                    if(comparator.compare(linkedList.get(min), linkedList.get(j))){
                        min = j;
                    }
                }
                if(min != i){
                    T d1 = linkedList.get(min);
                    T d2 = linkedList.get(i);
                    linkedList.set(min, d2);
                    linkedList.set(i, d1);
                }
            }
            return 1;
        }catch (Exception e){
            return 0;
        }
    }


}
