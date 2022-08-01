package data_structure.non_linear.Tree;

import algorithm.sorting.Comparator;

public class Tree<T> {

    Node<T> root;

    Comparator<T> comparator;

    public Tree(Comparator<T> comparator){
        this.comparator = comparator;
        root = null;
    }

    public Tree(Comparator<T> comparator, T data){
        this.comparator = comparator;
        root = new Node<>(data);
    }

    public void add(T data){
        if(root == null){
            root = new Node<>(data);
        }else{
            insert(new Node<>(data), root);
        }
    }

    private void insert(Node<T> node, Node<T> parent){
        if(node.getData() != parent.getData()){
            if(comparator.compare(node.getData(), parent.getData())){
                if(parent.getLeft() == null){
                    parent.setLeft(node);
                }else{
                    insert(node, parent.getLeft());
                }
            }else{
                if(parent.getRight() == null){
                    parent.setRight(node);
                }else{
                    insert(node, parent.getRight());
                }
            }
        }
    }

    public String traverse(Traverse traverse){
        switch (traverse){
            case INORDER:
                return inorderTraversal();
            case PREORDER:
                return preorderTraversal();
            case POSTORDER:
                return postorderTraversal();
            default:
                return inorderTraversal();
        }
    }

    private String inorderTraversal(){
        StringBuilder stringBuilder = new StringBuilder();
        inorder(stringBuilder, root);
        return stringBuilder.toString();
    }

    private void inorder(StringBuilder stringBuilder, Node<T> node){
        if(node == null) return;
        inorder(stringBuilder, node.getLeft());
        stringBuilder.append(node.getData()).append(" ");
        inorder(stringBuilder, node.getRight());
    }

    private String preorderTraversal(){
        StringBuilder stringBuilder = new StringBuilder();
        preorder(stringBuilder, root);
        return stringBuilder.toString();
    }

    private void preorder(StringBuilder stringBuilder, Node<T> node){
        if(node == null) return;
        stringBuilder.append(node.getData()).append(" ");
        preorder(stringBuilder, node.getLeft());
        preorder(stringBuilder, node.getRight());
    }

    private String postorderTraversal(){
        StringBuilder stringBuilder = new StringBuilder();
        postorder(stringBuilder, root);
        return stringBuilder.toString();
    }

    private void postorder(StringBuilder stringBuilder, Node<T> node){
        if(node == null) return;
        postorder(stringBuilder, node.getLeft());
        postorder(stringBuilder, node.getRight());
        stringBuilder.append(node.getData()).append(" ");
    }

    @Override
    public String toString() {
        return inorderTraversal();
    }
}
