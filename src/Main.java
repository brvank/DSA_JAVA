import algorithm.sorting.*;
import data_structure.linear.LinkedList.LinkedList;
import data_structure.non_linear.Graph.Graph;
import data_structure.non_linear.GraphAdj.GraphAdj;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

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

        Sort<Integer> integerSort = new MergeSort<>(new Comparator<Integer>() {
            @Override
            public boolean compare(Integer t1, Integer t2) {
                return t1 < t2;
            }
        });

        integerSort.sort(integerList);
        integerSort.sort(integerList2);

        System.out.println(integerList);
        System.out.println(integerList2);

    }
}
