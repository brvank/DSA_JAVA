import algorithm.sorting.BubbleSort;
import algorithm.sorting.Comparator;
import data_structure.linear.LinkedList.LinkedList;
import data_structure.non_linear.Graph.Graph;
import data_structure.non_linear.GraphAdj.GraphAdj;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> linkedList = new ArrayList<>();
        linkedList.add(18);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);
        linkedList.add(17);
        linkedList.add(10);
        System.out.println(linkedList);

        BubbleSort<Integer> bubbleSort = new BubbleSort<>(new Comparator<Integer>() {
            @Override
            public boolean compare(Integer t1, Integer t2) {
                return t1 > t2;
            }
        });

        bubbleSort.sort(linkedList);

        System.out.println(linkedList);

    }
}
