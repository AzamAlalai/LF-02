package schrit5;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste;
    private int motivation;
    private int gesamtMotivation;
    private int Staerke;
    private int gesamtStaerke;


    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerliste){
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerliste = spielerliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMotivation() {
        for (Spieler s:spielerliste) {
            motivation += s.getMotivation();
        }
        motivation += torwart.getMotivation();
        gesamtMotivation = motivation / (spielerliste.size()+1);
        return gesamtMotivation;
    }

    public int getStaerke() {
        for (Spieler s:spielerliste) {
            Staerke += s.getStaerke();
        }
        Staerke += torwart.getStaerke();
        gesamtStaerke = Staerke / (spielerliste.size()+1);
        return gesamtStaerke;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList getSpielerListe() {
        return spielerliste;
    }

    public void setSpielerliste(ArrayList spielerliste) {
        this.spielerliste = spielerliste;
    }

    @Override
    public String toString() {
        return "Mannschaft: " + "\n" +
                "[Name]" + "\n" + name + "\n" +
                "[Trainer]" + trainer + '\n' +
                "[Torwart]" + torwart + '\n' +
                "[Spieler]" + "\n" +getSpielerListe() +
                "\n\n[Gesamt Motivation]" + "\n" + getMotivation() +
                "\n[Gesamt Stärke]" + "\n" + getStaerke();
    }
}
