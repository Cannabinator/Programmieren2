package Uebung3;

    public class Student {
        private String name;
        private int matrikelnummer;
        private int MATRIKEL_START=100;
        private MengeDynArray<String> belegt;

        public Student(String name){
            belegt = new MengeDynArray<>();
            this.name = name;
            this.matrikelnummer=MATRIKEL_START;
            MATRIKEL_START++;
        }

        public void anmelden(Modul modul){
            modul.studenten.insert(matrikelnummer);
            belegt.insert(modul.bezeichnung);
        }
        public void abmelden(Modul modul){
            modul.studenten.delete(matrikelnummer);
            belegt.delete(modul.bezeichnung);
        }

        public void belegt(){
            belegt.size();
        }

        @Override
        public String toString(){

            return name;
        }
    }

