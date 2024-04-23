package uebung2;

public class MengeUtil{

    //wir implementieren eine merge methode die aus den beiden Object<Menge> Objekten eine machen sollen
    //die Menge b soll in Menge a geschrieben werden
    public static <T> void merge(Menge a, Menge b) {
        for(int i =0; i < b.size();i++){
           T element = (T) b.get();
           a.insert(element);
           b.delete(element);

        }
    }
}
