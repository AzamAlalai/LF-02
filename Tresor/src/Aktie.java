public class Aktie extends  Gegenstand{
    private String unternehemen;
    private double nennwert ;

    public Aktie(int id, double wert, String unternehemen, double nennwert) {
        super(id, wert);
        this.unternehemen=unternehemen;
        this.nennwert=nennwert;
    }

    public String getUnternehemen() {
        return unternehemen;
    }

    public void setUnternehemen(String unternehemen) {
        this.unternehemen = unternehemen;
    }

    public double getNennwert() {
        return nennwert;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    @Override
    public String toString() {
        return "Aktie{" +
                "unternehemen='" + unternehemen + '\'' +
                ", nennwert=" + nennwert +
                '}';
    }
}
