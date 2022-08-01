import algorithm.sorting.*;
import data_structure.linear.LinkedList.LinkedList;
import data_structure.non_linear.Graph.Graph;
import data_structure.non_linear.GraphAdj.GraphAdj;
import data_structure.non_linear.Tree.Traverse;
import data_structure.non_linear.Tree.Tree;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<Integer>(new Comparator<Integer>() {
            @Override
            public boolean compare(Integer t1, Integer t2) {
                return t1 < t2;
            }
        });

        tree.add(23);
        tree.add(12);
        tree.add(18);
        tree.add(32);
        tree.add(10);
        tree.add(25);
        tree.add(45);
        tree.add(16);

        System.out.println(tree.traverse(Traverse.PREORDER));

    }
}
