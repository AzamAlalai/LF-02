package schritt1;

public class Kunde extends Person {
    private Mitarbeiter betreuer;

    public Kunde(String vorname, String nachname, Mitarbeiter betreuer, Adresse adresseKunde) {
        super(vorname, nachname);

        this.betreuer=betreuer;
    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde{"
                +
                "vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\''+
                "betreuer=" + betreuer +

                '}';
    }
}
