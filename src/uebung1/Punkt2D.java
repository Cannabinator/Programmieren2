package uebung1;

public class Punkt2D {
    double x;
    double y;

    //in the class diagram there where no Class Variables at all so i made them up
    public double x(){
        return x;
    }
    public double y(){
        return y;
    }


    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double abstand(Punkt2D punkt2D){
        return x - punkt2D.x;
    }
}
