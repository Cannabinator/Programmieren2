package Uebung3;

public class Modul {

    public String bezeichnung;
    public int ectsPoints;
    public MengeDynArray<Integer> studenten;

    // Methoden -> keine
    // nur Konstruktor und toString neu implementiert

    public Modul(String bezeichnung, int ectsPoints) {
        this.bezeichnung = bezeichnung;
        this.ectsPoints = ectsPoints;
        studenten = new MengeDynArray<>();
}
@Override
public String toString(){
    return "studenten im Modul: " +studenten.size();
    }
}
