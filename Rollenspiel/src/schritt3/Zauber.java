package schritt3;

import schritt1.Spielfiguer;
import schritt4.KeineKraftException;

public class Zauber extends Spielfiguer {
    private int zauberpunkte;

    public Zauber(String name, int sterkepunkte, int zauberpunkte) {
        super(name, sterkepunkte);
        this.zauberpunkte=zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }
    public void  trinkenZaubertrank(){
        this.zauberpunkte=zauberpunkte+3;
    }
    public void zaubern () throws KeineKraftException {
        if (getZauberpunkte()-1 >= 0) {
            this.zauberpunkte = zauberpunkte - 1;
        }else {
            throw new KeineKraftException(getName(),"zaubern");
        }
    }

    @Override
    public String toString() {
        return "Zauber{" +
                "zauberpunkte=" + zauberpunkte +
                '}';
    }
}
