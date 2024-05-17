package uebung2;

import Uebung3.DynArray;
import Uebung3.EVL;
import Uebung3.Modul;
import Uebung3.Student;
import Uebung5.PostbotenIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Integer[] array = {1,2,3,4,5,6,7,8,9};
        PostbotenIterator<Integer> it = new PostbotenIterator<>(array);
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}

