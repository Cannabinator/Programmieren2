package uebung2;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {
       Menge<String> a = new MengeLimited<>();
       Menge<String> b = new MengeLimited<>();
       a.insert("hi");
       a.insert("spast");
       b.insert("geh");
       b.insert("kacken");
       System.out.println(a.toString());
       System.out.println(b.toString());
       MengeUtil.merge(a,b);
       System.out.println(a.toString());

   }

}

