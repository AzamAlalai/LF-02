import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgrammReadCsv {

        public static void main(String[] args) throws IOException {
            String datei = "H:/LF-02 Test/Kaufvertrag.csv";
            BufferedReader br = new BufferedReader(new FileReader(datei));
            String zeile;
            while ((zeile = br.readLine()) != null) {
                String[] array = zeile.split(";");
                for (String spalte : array){
                    System.out.println(spalte);
                }
            }
        }
    }

