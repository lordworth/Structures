package implementations;
//Stack interface to be used by stack class

public interface Stack<T> {
    public void push(T element);
    public T peek();
    public T pop();
    public void traverse();
}
