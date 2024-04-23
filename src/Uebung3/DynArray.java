package Uebung3;
/**
 * @author sw
 *
 * Dynamisches Array mit Verdopplung der Arraylaenge bei "voll"
 *
 * @version V03
 * noch ohne remove, delete, decrease
 */

public class DynArray<T> {

    /**
     *  methoden die ich benutzen kann  -> size
     *                                  -> isEmpty
     *                                  ->set ( int pos, T e)
     *                                  ->get (int pos)
     *                                  ->add( T e)
     *                                  ->Increase
     *                                  ->show
     *                                  ->remove (int pos)
     *                                  ->remove ( an stelle 0 )
     *                                  ->delete ( T e )
     *                                  ->contains( T e)
     *                                  ->PositionOfElement () // returns first positionOfElement
     */

    private static int startGroesse = 2; // Laenge des Arrays (initial)

    private T[] array;
    private int size; // Anzahl der "belegten" Plaetze


    @SuppressWarnings("unchecked")
    public DynArray() {
        array =  (T[]) new Object[startGroesse];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int pos, T e) throws IndexOutOfBoundsException {
        // Aendern von bereits belegten Positionen
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        array[pos]= e;
    }

    public T get(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    public void add(T e) {
        // hinzufuegen neuer Elemente
        if(size >= array.length)
            increase();
        array[size++] = e;
    }

    public String toString() {
        String  s = "";
        for (int i = 0; i < size; i++)
            s = s + array[i] + "\t";
        return s;
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        // Verlaengerung des Arrays bei Bedarf
        T[] neu = (T[]) new Object[array.length*2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }


    // nur fuer Testzwecke
    protected void show() {
        System.out.println("size\t length\t Array-Inhalt");
        System.out.print(size + "\t" + array.length + "\t");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println();
    }


    //remove mit input
    public void  remove (int pos){
    if(pos > size || pos < 0){
        throw new IndexOutOfBoundsException();
        }
    array[pos] = null;
    for (int i = pos; i < array.length; i++){
        array[i] = array[i+1];
        }
    }


    //remove an erster stelle (0)
    public void remove (){
        for(int i = 0; i < size; i++){
            if (array[i] != null){
                array[0] = null;
            }
        }
    }

    //delete erstes vorkommen von element in array
    public void delete (T e){
        int positionVonE = positionOfElement(e);
        remove(positionVonE);
    }

    //ist das element e im string ?
    public boolean contains(T e){
        boolean ret = false;
        for(int i=0; i < size; i++){
            if(array[i].equals(e)){ // wenn an der stelle i das element e steht ret = true
                ret = true ;
            }
        }
        return ret;
    }
    //hilfmethode für delete zeile 98
    public int positionOfElement (T e){
        for(int i = 0; i < size; i++){
            if(array[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public void decrease (){
        T[] neu = (T[]) new Object[array.length*2]; // neues array mit hälfte der size
        if (size*4< array.length) {                 // ist size*4 < array.length prüft ob max 25% gefüllt sind
            if(array.length/2<startGroesse){        // wir wollen das array nur halbieren so lange es größer als starGrösse
                System.out.println("array ist zu kurz zum halbieren");
            }                                       // wenn nicht zu kurz dann schreib alt in neu
            for(int i = 0; i< array.length;){
                neu [i] = array [i];
                array = neu;                        // neu = alt
            }

        }
    }



}