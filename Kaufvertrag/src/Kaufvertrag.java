public class Kaufvertrag {

    private Vertragspartner verkäufer;
    private Vertragspartner käufer;
    private Ware Ware;
    private String zahlungsModalitaeten;

    public Kaufvertrag(Vertragspartner verkäufer, Vertragspartner käufer, Ware ware) {
        this.verkäufer = verkäufer;
        this.käufer = käufer;
        this.zahlungsModalitaeten = zahlungsModalitaeten;

        Ware = ware;
    }

    public Vertragspartner getVerkäufer() {
        return verkäufer;
    }

    public Vertragspartner getKäufer() {
        return käufer;
    }

    public void setKäufer(Vertragspartner käufer) {
        this.käufer = käufer;
    }

    public Ware getWare() {
        return Ware;
    }

    public void setWare(Ware ware) {
        Ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        return "Kaufvertrag\n" +"verkäufer\n" + verkäufer + "\n-------------------------------------------" + "\n käufer\n"+
                käufer + "\n -------------------------------------" + " \nWare\n" + Ware +"\nZahlungsmodalitaeten " + zahlungsModalitaeten + "\n-----------------Ende-----------------";
    }
}