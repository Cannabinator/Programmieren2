package uebung2;

public class Kind extends Personen{

    Paar<Personen, Personen> eltern;    //the first Person is the father getFirst/setFirst
                                        //the second Person is the mother getSecond/setSecond

    //standard Construcot
    public Kind(String name, int geburtsjahr) {
        super(name, geburtsjahr);
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
        if(eltern == null) {
            eltern = new Paar<>(vater, mutter);
            this.eltern.setFirst(vater);
            this.eltern.setSecond(mutter);
        }else{
            throw (new RuntimeException("Eltern not null or allready set"));
        }
    }

    public Paar<Personen, Personen> getEltern(){
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
