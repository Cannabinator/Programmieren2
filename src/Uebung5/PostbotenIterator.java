package Uebung5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PostbotenIterator<T> implements Iterator<T> {

    /*Iterator als " externe öffentliche klasse "
     *          beispiele :
     *              ZeilenIterator2Darray
     *              DynArrayIterator
     *          Konstruktor benötigt das zu iterierende Objekt als
     *      übergabeparameter
     *      Iterator <Integer> it = new ZeilenIterator2DArray<>(arr2);
     *
     */

    T[] array;
    private int evenIndex;
    private int oddIndex;
    private int length;

    public PostbotenIterator(T[] array) {
        this.array = array;
        this.length = array.length;
        this.oddIndex = 0;
        this.evenIndex = ((array.length % 2 == 0) ? array.length - 2 : array.length - 1);

    }

    //hilfsmethode für T next

    @Override
    public boolean hasNext() {
        if (length % 2 == 0 && evenIndex >= 0) {
            return true;
        }
        if (length % 2 == 1 && oddIndex < length) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
    T nextElement;
    if(oddIndex<=length){
        nextElement = array[oddIndex];
        oddIndex += 2;
        return nextElement;
    }
    if(evenIndex>=0){
        nextElement = array[evenIndex];
        evenIndex -= 2;
        return nextElement;
    }else{
        throw new NoSuchElementException("leer oder so");
    }

    }

}
