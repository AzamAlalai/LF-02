import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PorgrammCSV {
    public static void main(String[] args) throws FileNotFoundException {
        Kaufvertrag kaufvertrag1= erstelleaufvertrag();
        wrirtCSV(kaufvertrag1);
    }
    private static Kaufvertrag erstelleaufvertrag(){
        //verkäufer
        Vertragspartner verkaeufer = new Vertragspartner("Azam","Alali");
        verkaeufer.setAusweisNr("12345678910");
        Adresse adresse1 = new Adresse("Juckt kein","629","225806","Kabul");
        //käufer
        Vertragspartner kaeufer = new Vertragspartner("Nasier","Amiere");
        verkaeufer.setAusweisNr("12345678911");
        Adresse adresse2 = new Adresse("Kein ahnung","6296","225806","Raqa");
        //waren
        Ware ware = new Ware("Kokaien",250000);
        ware.getBesonderheiten().add("Die waren kommen aus colombia");
        Kaufvertrag kaufvertrag1 = new Kaufvertrag(verkaeufer,kaeufer,ware);
        kaufvertrag1.setZahlungsModalitaeten("Paypal");


        return kaufvertrag1;

    }
    public static void wrirtCSV(Kaufvertrag kaufvertrag) throws FileNotFoundException {
        String datei = "H:/LF-02 Test/Kaufvertrag.csv";
        PrintWriter PrintWriter = new PrintWriter (datei);
        PrintWriter.print(kaufvertrag);
        PrintWriter.close();
    }



}
