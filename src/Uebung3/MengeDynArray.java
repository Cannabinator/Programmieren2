package Uebung3;


public class MengeDynArray<T> implements Menge<T> {

    private DynArray<T> array;

    public MengeDynArray() {
        array = new DynArray<>();
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public T get() {
        // Implementierung hängt von Ihren Anforderungen ab
        return null;
    }

    @Override
    public void insert(T e) {
        // Hier fügen Sie das Element 'e' zur Menge hinzu
        array.add(e);
    }

    @Override
    public void delete(T e) {
        // Hier entfernen Sie das Element 'e' aus der Menge
        array.delete(e);
    }

    @Override
    public boolean contains(T e) {
        return array.contains(e);
    }
}

