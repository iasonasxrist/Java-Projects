package model.utils;

public interface  FIFOInterface<T> {

    public void add( T elements) throws FIFOException;

    public void pop() throws FIFOException;

    public T first();

    public void clear();
}
