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

    T [] array;
    private int evenIndex;
    private int oddIndex;
    private int length;

    public PostbotenIterator(T[] array){
        this.array=array;
        this.length =array.length;
        this.oddIndex = 0;
        this.evenIndex = ((array.length % 2 == 0)? array.length-1:array.length);

    }

    //hilfsmethode für T next

    @Override
    public boolean hasNext() {
        if (length == 1) {
            return oddIndex == 1;
        }
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
        if (!hasNext()) {
            throw new NoSuchElementException("No Next Element");
        }

        if (oddIndex < length && evenIndex >= 0) {
            // Check if odd index is smaller than length and even index is not negative
            if (oddIndex <= evenIndex) {
                T nextElement = array[oddIndex];
                oddIndex += 2;  // Move to the next odd index
                return nextElement;
            } else {
                T nextElement = array[evenIndex];
                evenIndex -= 2;  // Move to the next even index
                return nextElement;
            }
        } else if (oddIndex < length) {
            T nextElement = array[oddIndex];
            oddIndex += 2;  // Move to the next odd index
            return nextElement;
        } else if (evenIndex >= 0) {
            T nextElement = array[evenIndex];
            evenIndex -= 2;  // Move to the next even index
            return nextElement;
        }

        throw new NoSuchElementException("No Next Element");
    }



}
