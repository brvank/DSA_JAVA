import algorithm.sorting.*;
import data_structure.linear.LinkedList.LinkedList;
import data_structure.non_linear.Graph.Graph;
import data_structure.non_linear.GraphAdj.GraphAdj;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> arrayList = new LinkedList<>();
        System.out.println(arrayList);
        arrayList.add(18);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(-9);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(10);
        System.out.println(arrayList);

        Sort<Integer> integerSort = new InsertionSort<>(new Comparator<Integer>() {
            @Override
            public boolean compare(Integer t1, Integer t2) {
                return t1 < t2;
            }
        });

        integerSort.sort(arrayList);

        System.out.println(arrayList);

    }
}
