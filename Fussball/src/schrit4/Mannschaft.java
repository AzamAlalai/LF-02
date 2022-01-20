package schrit4;

import schrit1.Trainer;
import schrit2.Torwart;

public class Mannschaft {
    private String name;
    private Trainer Trainer;
    private Torwart torwart;

    public Mannschaft(String name, Trainer trainer, Torwart torwart){
        this.name=name;
        this.Trainer=trainer;
        this.torwart=torwart;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Trainer getTrainer() {
        return Trainer;
    }

    public void setName(Trainer trainer) {
        this.Trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }


}
