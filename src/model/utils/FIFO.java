package model.utils;

import java.util.ArrayList;
import java.util.List;

public class FIFO<T> implements FIFOInterface<T>{

    List<T> fifoq;
    public FIFO() {
        fifoq = new ArrayList<T>();
    }

    @Override
    public void add(T elements) throws FIFOException {

        try {
            fifoq.add(elements);
        }
        catch (Exception e){
            throw new FIFOException("Cannot remove any element frosm queue");
        }

    }

    @Override
    public void pop() throws FIFOException{
        try{

            fifoq.remove(0);
        }
        catch (Exception e){
            throw new FIFOException("Cannot remove any element frosm queue");
        }

    }

    @Override
    public T first() {
     if (fifoq.size()>0) {
         return fifoq.get(0);
     }
     return null;
    }

    @Override
    public void clear() {
        fifoq.clear();

    }
}
