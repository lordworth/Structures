package implementations;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private NodeB<T> root;

    @Override
    public void addNode(T element) {
        NodeB<T> newNode= new NodeB<>(element);
        


    }

    @Override
    public void inOrder(NodeB<T> start) {
        if(start==null){
            return;
        }

        inOrder(start.getLeftChild());
        System.out.println(start.getData());
        inOrder(start.getRightChild());



    }
    @Override
    public void traverse(){
        inOrder(this.root);
    }

    @Override
    public void preOrder(NodeB<T> preStart) {

    }

    @Override
    public void postOrder(NodeB<T> postStart) {

    }

    @Override
    public void remove(T element) {

    }
}
