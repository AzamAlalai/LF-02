package schrit1;

public class Trainer {
    private String name;
    private int alter;
    private int erfahrung;

    public Trainer (String name , int alter , int erfahrung){
        this.name = name;
        this.alter= alter;
        this.erfahrung=erfahrung;
    }
    public Integer getAlter() {
        return alter;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }

    public Integer getErfahrung() {
        return erfahrung;
    }
    public void setErfahrung(int erfahrung){
        this.erfahrung = erfahrung;
    }


}
