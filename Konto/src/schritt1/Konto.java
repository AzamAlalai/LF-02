package schritt1;

public class Konto {
    private Kunde inhaber;
    private double kontostand;
    private double kreditlimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditlimit,double zinsGuthaben){
        this.inhaber=inhaber;
        this.kontostand=0;
        this.kreditlimit=kreditlimit;
        this.zinsGuthaben=zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(double kreditlimit) {
        this.kreditlimit = kreditlimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }
    public boolean einzahlen (double betrag){
        this.kontostand += betrag;
        return false;
    }
    public boolean auszahlen(double betrag){
        if (kontostand+kreditlimit>=betrag){
            kontostand=kontostand-betrag;
            return true;
        }else {
            return false;
        }
    }
}
