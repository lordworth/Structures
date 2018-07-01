package implementations;

public class Stac<T extends Comparable<T>> implements Stack<T> {
    private Node<T> root;

    @Override
    public void push(T element) {
        Node<T> newNode= new Node<>(element);
        if(root==null){
            root=newNode;
        }
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public void traverse() {

    }
}
