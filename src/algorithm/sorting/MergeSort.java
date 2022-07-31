package algorithm.sorting;

import data_structure.linear.LinkedList.LinkedList;

import java.util.ArrayList;

public class MergeSort<T> extends Sort<T>{

    public MergeSort(Comparator<T> comparator) {
        super(comparator);
    }

    @Override
    public int sort(ArrayList<T> arrayList) {
        try{
            mergeSort(arrayList, 0, arrayList.size()-1);
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    private void mergeSort(ArrayList<T> arrayList, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arrayList, left, mid);
            mergeSort(arrayList, mid+1, right);
            merge(arrayList, left, mid, right);
        }
    }

    private void merge(ArrayList<T> arrayList, int left, int mid, int right){
        ArrayList<T> arrayList1 = new ArrayList<>(), arrayList2 = new ArrayList<>();

        for(int i=left;i<=mid;i++){
            arrayList1.add(arrayList.get(i));
        }

        for(int i=mid+1;i<=right;i++){
            arrayList2.add(arrayList.get(i));
        }

        int l1 = 0, l2 = 0, l = left;
        while(l1<arrayList1.size() && l2<arrayList2.size()){
            if(comparator.compare(arrayList1.get(l1), arrayList2.get(l2))){
                arrayList.set(l++, arrayList1.get(l1++));
            }else{
                arrayList.set(l++, arrayList2.get(l2++));
            }
        }

        while(l1<arrayList1.size()){
            arrayList.set(l++, arrayList1.get(l1++));
        }

        while(l2<arrayList2.size()){
            arrayList.set(l++, arrayList2.get(l2++));
        }
    }

    @Override
    public int sort(LinkedList<T> linkedList) {
        try{
            mergeSort(linkedList, 0, linkedList.size()-1);
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    private void mergeSort(LinkedList<T> linkedList, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(linkedList, left, mid);
            mergeSort(linkedList, mid+1, right);
            merge(linkedList, left, mid, right);
        }
    }

    private void merge(LinkedList<T> linkedList, int left, int mid, int right){
        LinkedList<T> linkedList1 = new LinkedList<>(), linkedList2 = new LinkedList<>();

        for(int i=left;i<=mid;i++){
            linkedList1.add(linkedList.get(i));
        }

        for(int i=mid+1;i<=right;i++){
            linkedList2.add(linkedList.get(i));
        }

        int l1 = 0, l2 = 0, l = left;

        while(l1<linkedList1.size() && l2<linkedList2.size()){
            if(comparator.compare(linkedList1.get(l1), linkedList2.get(l2))){
                linkedList.set(l++, linkedList1.get(l1++));
            }else{
                linkedList.set(l++, linkedList2.get(l2++));
            }
        }

        while(l1<linkedList1.size()){
            linkedList.set(l++, linkedList1.get(l1++));
        }

        while(l2<linkedList2.size()){
            linkedList.set(l++, linkedList2.get(l2++));
        }
    }
}