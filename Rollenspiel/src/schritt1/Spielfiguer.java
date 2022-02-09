package schritt1;

import schritt4.KeineKraftException;

public class Spielfiguer {
    private String name;
    private int sterkepunkte;

    public Spielfiguer(String name , int sterkepunkte){
        this.name=name;
        this.sterkepunkte=sterkepunkte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSterkepunkte() {
        return sterkepunkte;
    }

    protected void setSterkepunkte(int sterkepunkte) {
        this.sterkepunkte = sterkepunkte;
    }
    public void essen(){
        setSterkepunkte(getSterkepunkte()+10);

    }
    public void laufen () throws KeineKraftException {
        if (getSterkepunkte()-1 >= 0) {
            setSterkepunkte(getSterkepunkte() - 1);
        }else {
            throw new KeineKraftException(getName(),"laufen");
        }
    }
    public void kletten() throws KeineKraftException {
        if (getSterkepunkte()-2 >= 0) {
            setSterkepunkte(getSterkepunkte() - 2);
        }else {
            throw new KeineKraftException(getName(),"kletten");
        }
    }
    public void keampfen() throws KeineKraftException {
        if (getSterkepunkte()-3 >= 0 ) {
            setSterkepunkte(getSterkepunkte() - 3);
        }else {
            throw new KeineKraftException(getName(),"keampfen");
        }
    }

    @Override
    public String toString() {
        return
                "Spielfiguer{" +
                "name='" + name +
                        '\'' +
                ", sterkepunkte="
                        + sterkepunkte +
                '}';
    }
}
