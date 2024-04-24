package uebung2;

import Uebung3.DynArray;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {
       DynArray<Integer> array = new DynArray();
       for(int i = 0;i<10;i++){
           array.add(i);
       }
       System.out.println(array);
       array.remove(4);
       System.out.println(array);
       array.remove();
       System.out.println(array);
       System.out.println(array.positionOfElement(3));
       System.out.println(array);
       array.remove();
       array.delete(1);
       array.delete(2);
       array.delete(3);
       array.delete(5);
       array.delete(6);
       System.out.println(array);
       array.contains(4);
   }

}

