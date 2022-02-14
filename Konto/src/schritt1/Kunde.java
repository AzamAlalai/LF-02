package schritt1;

public class Kunde extends Person {
    private Mitarbeiter betreuer;

    public Kunde(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "betreuer=" + betreuer +
                '}';
    }
}
