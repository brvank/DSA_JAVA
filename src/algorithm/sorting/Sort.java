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

/*
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(18);
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);
        integerList.add(-9);
        integerList.add(16);
        integerList.add(17);
        integerList.add(10);
        System.out.println(integerList);

        LinkedList<Integer> integerList2 = new LinkedList<>();
        integerList2.add(17);
        integerList2.add(16);
        integerList2.add(-9);
        integerList2.add(14);
        integerList2.add(13);
        integerList2.add(12);
        integerList2.add(11);
        integerList2.add(18);
        System.out.println(integerList2);

        Sort<Integer> integerSort = new QuickSort<>(new Comparator<Integer>() {
            @Override
            public boolean compare(Integer t1, Integer t2) {
                return t1 > t2;
            }
        });

        integerSort.sort(integerList);
        integerSort.sort(integerList2);

        System.out.println(integerList);
        System.out.println(integerList2);
        */
