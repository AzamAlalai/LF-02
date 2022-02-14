package schritt1;

public class Girokonto extends Konto{

    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditlimit, double zinsGuthaben, double zinsKredit) {
        super(inhaber, kreditlimit, zinsGuthaben);
        this.zinsKredit=zinsKredit;
    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }
    public boolean uberweisung (double betrag , Girokonto girokonto){
        if (getKontostand()+ getKreditlimit()>= betrag){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "zinsKredit=" + zinsKredit +
                '}';
    }
}
