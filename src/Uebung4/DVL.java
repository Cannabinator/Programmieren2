package Uebung4;

public class DVL <T>{

    //InstanzVariablen
   private ListenElem first;
   private ListenElem last;
   int size = 0;

    // Innere Klasse um ein Objekt ListenElem zu erstellen dass einen prev und einen next wert hat
    class ListenElem {
        T value;
       private ListenElem next;
       private ListenElem prev;

        ListenElem (T v) {
            value = v;
            next = null;
            prev = null;
        }
    }

    boolean isEmpty(){
        if (!(first ==null))return false;
        return true;
    }

    T getFirst(){
        return first.value;
    }
    T getLast(){
        return last.value;
    }

    void insert (T v){
        //fügt am anfang der Liste element v ein
        ListenElem neu = new ListenElem(v);
        if(isEmpty()) {
            //wenn die liste leer ist do ...
            last = first = neu;
            size ++;
            return;
        }
        // wenn bereits elemente in der liste sind...
        neu.next = first;
        neu.next.prev = neu;
        first = neu;
        size ++;
    }

    public void append (T v){
        ListenElem neu = new ListenElem(v);
        if(isEmpty()){
            last = first = neu;
            size ++;
            return;
        }
        last.next = neu;
        neu.prev = last;
        neu.prev.next = neu;
        last = neu;
        size ++;
    }

    public void removeFirst(){

        if(isEmpty())return;

        first=first.next;
        size --;
            if(isEmpty()) last=null;
            else
                first.prev=null;
    }

    public void removeLast(){
        if(isEmpty())return;
        if(size==1){removeFirst();}
        last.prev=last;
        last.prev.next = null;
        size--;
    }

    public void delete(T v){
        ListenElem current = first.next;
        if (isEmpty()) return;
        if(first.value.equals(v)){removeFirst(); return;}
        if(last.value.equals(v)){removeLast(); return;}
        while(!current.value.equals(v)){
            current = current.next;
            if(current.value.equals(v)){
                current.prev.next=current.next;
                current.next.prev=current.prev;
                size--;
            }
        }
    }

    public boolean contains(T value){
        if (isEmpty()) return false;

        ListenElem e = first;
        while (!e.value.equals(value) && e.next != null) {
            e = e.next;
        }
        return e.value.equals(value);
    }
}
