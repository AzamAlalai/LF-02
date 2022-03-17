import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PorgrammCSV {
    public static void main(String[] args) throws FileNotFoundException {
        csv(KaufvertragErstellen());

    }
    public static Kaufvertrag KaufvertragErstellen() {
        //Käufer
        Vertragspartner Käufer = new Vertragspartner("Azam", "Alali");
        Adresse Käuferadresse = new Adresse("Ehlersdamm", "88", "28307", "Bremen");
        Käufer.setAdresse(Käuferadresse);
        Käufer.setAusweisNr("12345678910");

        //Verkäufer
        Vertragspartner Verkäufer = new Vertragspartner("Mohmmad", "Abazid");
        Adresse Verkäuferadresse = new Adresse("Zwischen Dorpen", "41", "28259", "Bremen");
        Verkäufer.setAdresse(Verkäuferadresse);
        Verkäufer.setAusweisNr("12345678910");

        //Ware
        Ware ware = new Ware("Kette",25);
        ware.addBesonderheiten("Dierekt aus Holland");
        ware.addMaengel("Starke Nebenwirkungen");

        //Vertrag
        Kaufvertrag kaufvertrag = new Kaufvertrag(Verkäufer, Käufer, ware);

        return kaufvertrag;
    }




    public static void csv(Kaufvertrag kaufvertrag) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Test629.csv");
        pw.print("Vertragsparntner;");

        pw.print("Name;");
        pw.print("Straße;");
        pw.print("PLZ;");
        pw.print("Ort;");
        pw.println("AusweissNr");


        // Verkäufer
        pw.print("Verkäufer;");
        pw.print(kaufvertrag.getVerkäufer().getNachname() + "," + kaufvertrag.getVerkäufer().getVorname() + ";");
        pw.print(kaufvertrag.getVerkäufer().getAdresse().getStrasse() + " " + kaufvertrag.getVerkäufer().getAdresse().getHausNr() + ";");
        pw.print(kaufvertrag.getVerkäufer().getAdresse().getPlz() + ";");
        pw.print(kaufvertrag.getVerkäufer().getAdresse().getOrt() + ";");
        pw.println(kaufvertrag.getVerkäufer().getAusweisNr());
        //Käufer
        pw.print("Käufer;");
        pw.print(kaufvertrag.getKäufer().getNachname() + "," + kaufvertrag.getKäufer().getVorname() + ";");
        pw.print(kaufvertrag.getKäufer().getAdresse().getStrasse() + " " + kaufvertrag.getKäufer().getAdresse().getHausNr() + ";");
        pw.print(kaufvertrag.getKäufer().getAdresse().getPlz() + ";");
        pw.print(kaufvertrag.getKäufer().getAdresse().getOrt() + ";");

        pw.println(kaufvertrag.getKäufer().getAusweisNr());

        pw.close();
    }

}

