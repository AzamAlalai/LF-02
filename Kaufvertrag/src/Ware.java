import java.util.ArrayList;

public class Ware {

    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten;
    private ArrayList<String> maengel;

    public Ware(String bezeichnung,double preis) {
        this.bezeichnung = bezeichnung;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.besonderheiten = new ArrayList<>();
        this.maengel = new ArrayList<>();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public ArrayList<String> getMaengel() {
        return maengel;
    }

    public void addMaengel(String maengel) {
        this.maengel.add(maengel);
    }

    public void addBesonderheiten(String besonderheiten) {
        this.besonderheiten.add(besonderheiten);
    }




    @Override
    public String toString() {
        return "Die Bezeichnung ist [" + getBezeichnung() + "]\nDie Beschreibung ist [" + getBeschreibung() + "]\nDer Preis ist [" + getPreis() + "]\nDie Besonderheiten sind " + getBesonderheiten() + "\nDie Mängel sind " + getMaengel();
    }
}