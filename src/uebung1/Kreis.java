package uebung1;

public class Kreis {
    private double radius;

    public Kreis(double radius, Punkt2D mittelpunkt){
        if (radius < 0){
            this.radius = radius*(-1);
        }

    }

    public Punkt2D mittelpunkt(){
        return this.mittelpunkt();
    }
    public double radius(){
        return this.radius;
    }
}
