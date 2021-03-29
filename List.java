package sample;

public interface List<T> {
    public void add(T item) throws Exception;

    public void add(int index, T item) throws Exception;

    public T remove(int index) throws Exception;

    public boolean removeFirst(T item) throws Exception;

    public T get(int index) throws Exception;

    public void clear();

    public T set(int index, T item) throws Exception;

    public int size();

    public boolean isEmpty();

    public boolean contains(T item);

    public int indexOf(T item);

    public int lastIndexOf(T item);

    public T[] toArray();
}
