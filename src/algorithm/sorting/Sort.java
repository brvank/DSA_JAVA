package algorithm.sorting;

import data_structure.linear.LinkedList.LinkedList;

import java.util.ArrayList;

public abstract class Sort<T> {

    public Comparator<T> comparator;

    public Sort(Comparator<T> comparator){
        this.comparator = comparator;
    }

    //sorting methods for different data structures
    public abstract int sort(ArrayList<T> arrayList);
    public abstract int sort(LinkedList<T> linkedList);
}
