package implementations;

public class NodeB<T extends Comparable<T>> implements Comparable<T> {
    private T data;
    private NodeB<T> leftChild;
    private NodeB<T> rightChild;

    public NodeB(T data){
        this.data=data;

    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeB<T> getLeftChild() {
        return this.leftChild;
    }


    public void setLeftChild(NodeB<T> leftChild) {
        this.leftChild = leftChild;
    }

    public NodeB<T> getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(NodeB<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public int compareTo(T element){
        return this.data.compareTo(element);
    }
}
