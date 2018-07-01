package implementations;

public interface Tree<T extends Comparable<T>> {
    public void addNode(T element);
    public void inOrder(NodeB<T> inStart);
    public void preOrder(NodeB<T> preStart);
    public void postOrder(NodeB<T> postStart);
    public void remove(T element);
    public void traverse();
}
