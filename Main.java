import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // Пример користење на класата Datoteka
        Datoteka datoteka = new Datoteka("primer.txt");

        // Запишување текст во фајл
        datoteka.zapisiVoFajl("Ова е текст кој се запишува во фајл.");

        // Читање од фајл и печатење на конзола
        System.out.println("Содржината на фајлот е:");
        datoteka.citajOdFajl();
    }
}