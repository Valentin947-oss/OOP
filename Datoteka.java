import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Datoteka {
    private String imeNaFajl;

    //  konstruktor
    public Datoteka(String imeNaFajl) {
        this.imeNaFajl = imeNaFajl;
    }


    public void zapisiVoFajl(String tekst) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(imeNaFajl))) {
            writer.write(tekst);
            System.out.println("Текстот е успешно запишан во фајл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 
    public void citajOdFajl() {
        try (BufferedReader reader = new BufferedReader(new FileReader(imeNaFajl))) {
            String linija;
            while ((linija = reader.readLine()) != null) {
                System.out.println(linija);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


