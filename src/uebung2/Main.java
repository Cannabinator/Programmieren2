package uebung2;

public class Main {
   public static void main(String[] args) {
       Kind mona = new Kind("mona", 1930);
       Kind marge = new Kind("marge",1969);
       Kind clancy = new Kind("clancy", 1920);
       Kind jackie = new Kind("jackie", 1931);
       Kind herb = new Kind("herb",1959);
       Kind patty = new Kind("patty", 1959);
       Kind abe = new Kind("Abe", 1930);
       Kind homer=new Kind("Homer",1960);
       Kind bart=new Kind("Bart",1985);
       Kind maggie = new Kind("maggie", 2000);
       Kind lisa = new Kind("lisa",1995);

       bart.setEltern(homer, marge);
       lisa.setEltern(homer, marge);
       abe.setEltern(homer,null);
       Kind.geschwister(bart,lisa);

   }
}

