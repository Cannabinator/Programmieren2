package Uebung3;

import java.util.NoSuchElementException;

public class EVL<T> {

   private ListenElem first;
   private ListenElem last;
   private int size;

    class ListenElem{
        T value;
        ListenElem next;
        ListenElem(T v){
            value = v;
            next = null;
        }
    }

    public EVL(){
        this.last=null;
        this.first=null;
        this.size=0;

    }
    public int size(){
        return this.size;
    } // return size of EVL<T>


    public boolean isEmpty(){
        return (first==null);
    } // is EVL empty ?


    public T getFirst()throws NoSuchElementException{
        //liefert val vom vordersten element
        if(first==null){
            throw new NoSuchElementException("liste leer");
        }
        return first.value;
    }

    public T get()throws NoSuchElementException{
        return getFirst();
    }

    public T getLast()throws NoSuchElementException{
     if(last==null){
         throw new NoSuchElementException("Liste leer");
     }
     return last.value;
    }

    public void insert (T v){
        // insert value of T at the first position -> = 0
        ListenElem neu = new ListenElem(v);
        neu.next = first;
        first = neu;
        size++;
        if(last == null){
            last = neu;
        }
    }

    public void remove (){
        //entfernt vorderstes element
        if(first==null)
            return;
        first=first.next;
        size--;
    }
    public boolean contains(T v) {
        ListenElem e = first;
        // suche Element e mit Eintrag v
        while(e != null && !e.value.equals(v)) {
            e = e.next;
        }
        return (e != null);
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ListenElem tmp = first;
        while (tmp!= null) {
            s.append(tmp.value).append(" ");
            tmp = tmp.next;
        }
        return s.toString();
    }

    void append (T v) {
        ListenElem neu = new ListenElem(v);
        ListenElem current = first;
        if (current != null) {
            current = current.next;
            if (current.next == null) {
                current.next = neu;
                size++;
            }
        }
    }
    void appendViaSize(T v){
        ListenElem neu = new ListenElem(v);
        for(ListenElem e = first; e != null; e = e.next) {
            if(e.next==null){
                e = neu ;
            }
        }
    }

    public void delete(T v){
        ListenElem current = first;
        ListenElem nextElem = first.next;
        if(current != null) {
            current = current.next;
            nextElem = nextElem.next;
            if (nextElem.equals(v)) {
                nextElem = nextElem.next;
            }

        }
    }
}