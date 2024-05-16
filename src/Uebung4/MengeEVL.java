package Uebung4;

import Uebung3.EVL;
import Uebung3.Menge;

public class MengeEVL<T> implements Menge<T> {

    private EVL<T> evl;

    public MengeEVL(){
        this.evl= new EVL<>();
    }

    @Override
    public int size() {
        return evl.size();
    }

    @Override
    public boolean isEmpty() {
        return evl.isEmpty();
    }

    @Override
    public T get() {
        return null;
    }

    @Override
    public void insert(T e) {
        if(evl.contains(e))return;
        evl.insert(e);
    }

    @Override
    public void delete(T e) {
        if(!evl.contains(e))return;

    }

    @Override
    public boolean contains(T e) {
        return false;
    }
}
