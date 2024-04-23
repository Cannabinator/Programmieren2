package uebung2;

public class Paar <E,Z> {
    private E first;
    private Z second;

    public Paar(E first, Z second) {
        this.first=first;
        this.second=second;
    }
    public E getFirst(){
        return first;
    }
    public Z getSecond(){
        return second;
    }
    public void setFirst(E e){
        this.first = e;
    }
    public void setSecond(Z z){
        this.second = z;
    }
    @Override
    public String toString(){
        return "Paar [first:" + first + ", second:" + second + "]";
    }
    @Override
    public boolean equals(Object o){

        //false if Object o ist not instanceof Class Paar<E,Z>
        if(!(o instanceof Paar)){
            return false;
        }
        //cast Object to Class Paar<E,Z>
        Paar<E,Z> paar = (Paar<E,Z>) o;
        boolean firstIsTrue= this.getFirst()==(paar.getFirst());
        boolean secondIsTrue= this.getSecond()==(paar.getSecond());

        return (firstIsTrue && secondIsTrue);
    }
}
