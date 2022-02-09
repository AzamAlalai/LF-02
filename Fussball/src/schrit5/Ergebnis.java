package schrit5;

public class Ergebnis {
    private int toreHeim;
    private int toreGast;


    public int addToreHeim() {
        toreHeim ++;
        return toreHeim;
    }

    public int addToreGast() {
        toreGast ++;
        return toreGast;
    }

    @Override
    public String toString() {
        return "[Ergebnis]" +
                "\n[Heimtore]" + toreHeim +
                "\n[Gasttore]" + toreGast;
    }
}