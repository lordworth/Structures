package implementations;

public interface List<T extends Comparable<T>> {
    public void add(T element);
    public void remove(T element);
    public void traverse();
    public void removeDuplicates();
    public void sort();
}
