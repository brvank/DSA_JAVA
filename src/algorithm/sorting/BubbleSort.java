package algorithm.sorting;

import data_structure.linear.LinkedList.LinkedList;

import java.util.ArrayList;

public class BubbleSort<T> extends Sort<T> {

    public BubbleSort(Comparator<T> comparator){
        super(comparator);
    }

    @Override
    public int sort(ArrayList<T> arrayList) {
        try{
            //bubble sort algorithm
            for(int i=0;i< arrayList.size()-1;i++){
                boolean check = true;
                for(int j=0;j< arrayList.size() - i - 1;j++){
                    if(comparator.compare(arrayList.get(j), arrayList.get(j+1))){
                        check = false;
                        //swap
                        T j1 = arrayList.get(j);
                        T j2 = arrayList.get(j+1);
                        arrayList.set(j, j2);
                        arrayList.set(j+1, j1);
                    }
                }
                if(check){
                    return 1;
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
            //bubble sort algorithm
            for(int i=0;i< linkedList.length()-1;i++){
                boolean check = true;
                for(int j=0;j< linkedList.length() - i - 1;j++){
                    if(comparator.compare(linkedList.get(j), linkedList.get(j+1))){
                        check = false;
                        //swap
                        T j1 = linkedList.get(j);
                        T j2 = linkedList.get(j+1);
                        linkedList.set(j, j2);
                        linkedList.set(j+1, j1);
                    }
                }
                if(check){
                    return 1;
                }
            }
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
