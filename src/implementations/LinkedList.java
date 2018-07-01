package implementations;
import java.util.*;


public class LinkedList<T extends Comparable<T>> implements List<T> {
    private Node<T> root;
    private  int size;

    @Override
    public void add(T element) {
        size++;
        Node<T> newNode=new Node(element);

        if(root==null){
            root=newNode;
        }

        else {
            newNode.setParent(root);
            root=newNode;
        }
    }

    @Override
    public void remove(T element) {
        if(root==null){
            return;
        }
        if(root.getData().compareTo(element)==0) {
            Node<T> oldRoot=root;
            root=root.getParent();
            oldRoot.setParent(null);
        }

        else{
            remove(element,root,root.getParent());
        }

    }

    private void remove(T element, Node<T> previous, Node<T> current){

        while(current!=null){
            if(current.getData().compareTo(element)==0){
                previous.setParent(current.getParent());
                current.setParent(null);
                return;
            }
            previous=current;
            current=current.getParent();
        }

        }

    @Override
    public void traverse(){
        traverse(this.root);
    }

    public void traverse(Node<T> start) {
        if(start==null){
            return;
        }
        System.out.println(start.getData().toString());
        traverse(start.getParent());

    }

    @Override
    public void removeDuplicates() {

    }

    @Override
    public void sort() {

    }
}

class Node<T extends Comparable<T>> implements Comparable<T> {
    private T data;
    private Node<T> parent;

    //Constructor
    public Node(T data){this.data=data; }

    //Getters
    public T getData(){ return this.data; }
    public Node<T> getParent(){return this.parent; }

    //Setters
    public void setData(T data){this.data=data;}
    public void setParent(Node<T> parent){this.parent=parent;}


    @Override
    public int compareTo(T element) {
        return this.data.compareTo(element);
    }

}