package uebung2;

public class Kind extends Personen{

    Paar<Personen, Personen> eltern;    //the first Person is the father getFirst/setFirst
                                        //the second Person is the mother getSecond/setSecond

    //standard Construcot
    public Kind(String name, int geburtsjahr) {
        super(name, geburtsjahr);
    }

    //Constructor with 2 Persons as Input
    public Kind (String name, int geburtsjahr, Personen vater, Personen mutter){
        super(name, geburtsjahr);
        this.eltern.setFirst(vater);
        this.eltern.setSecond(mutter);
    }

    public String getName() {
        return name;
    }
    public int getGeburtsjahr() {
        return geburtsjahr;
    }
    @Override
    public String toString() {
        return name+" "+"("+geburtsjahr+")";
    }

    public void setEltern(Personen vater,Personen mutter){
        this.eltern.setFirst(vater);
        this.eltern.setSecond(mutter);
    }

    public Paar<Personen, Personen> getEltern(){
        System.out.println("Vater: "+this.eltern.getFirst());
        System.out.println("Mutter: "+this.eltern.getSecond());
        return this.eltern;
    }

    public static Boolean geschwister(Kind a, Kind b){
        Boolean result=false;
        Personen aVater=a.getEltern().getFirst();
        Personen aMutter=a.getEltern().getSecond();
        Personen bVater=b.getEltern().getFirst();
        Personen bMutter=b.getEltern().getSecond();
        if(aVater.equals(bVater)&&aMutter.equals(bMutter)){
            result=true;
        }
        return result;
    }
}
