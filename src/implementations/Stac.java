package implementations;

public class Stac<T extends Comparable<T>> implements Stack<T> {
    private Node<T> root;

    @Override
    public void push(T element) {
        Node<T> newNode= new Node<>(element);
        if(root==null){
            root=newNode;
        }
        else {
            newNode.setParent(root);
            root=newNode;
        }


    }

    @Override
    public T peek() {
        return root.getData();
    }

    @Override
    public T pop() {
        Node<T> oldroot=root;
        root=root.getParent();
        oldroot.setParent(null);
        return oldroot.getData();

    }

    @Override
    public void traverse() {
        while (root!=null){
            System.out.println(root.getData());
            root=root.getParent();
        }

    }
}
