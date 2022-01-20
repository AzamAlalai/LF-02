package schrit1;

import schrit3.Person;

public class Spieler extends Person {

    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;


    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int tore) {
        super(name,alter);

        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;

    }



    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getTore() {
        return tore;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }






        @Override
        public String toString () {
            String spieler =super.toString();

            spieler += "\nstaerke: " + staerke;
            spieler += "\ntorschuss: \t" + torschuss;
            spieler += "\nmotivation: \t" + motivation;
            spieler += "\ntore: \t" + tore;
            return spieler;


        }
    }


