package uebung2;

public class PaarException extends Exception{
    public PaarException(){
        super("Parameters dont match");
    }

    public PaarException(String message){
        super(message);
    }
}
