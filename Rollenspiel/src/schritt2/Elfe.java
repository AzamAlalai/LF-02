package schritt2;

import schritt1.Spielfiguer;
import schritt4.KeineKraftException;

public class Elfe extends Spielfiguer {

    public Elfe(String name, int sterkepunkte) {
        super(name, sterkepunkte);
    }
    public void rennen() throws KeineKraftException {
        if (getSterkepunkte()-2 >= 0 ) {
            int rennen = getSterkepunkte() - 2;
        }else {
            throw new KeineKraftException(getName(),"rennen");
        }
    }

    @Override
    public String toString () {
        return super.toString();
    }
}
