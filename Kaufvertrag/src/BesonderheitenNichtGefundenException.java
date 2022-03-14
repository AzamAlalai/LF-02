public class BesonderheitenNichtGefundenException {
    private final String besonderheiten;

    public BesonderheitenNichtGefundenException(String besonderheiten) {
        this.besonderheiten = besonderheiten;
    }

    public String getBesonderheiten() {
        return besonderheiten;
    }

    @Override
    public String toString() {
        return "Die Besonderheit [" + getBesonderheiten() + "] Wurde nicht gefunden";
    }

}
