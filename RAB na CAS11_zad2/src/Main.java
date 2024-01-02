import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Здраво на сите");

        // Креирање на Scanner објект за читање од тастатура
        Scanner scanner = new Scanner(System.in);

        System.out.println("Внесете текст и притиснете Enter:");

        // Читање на текст од тастатура
        String vnesenTekst = scanner.nextLine();

        // Печатење на внесениот текст
        System.out.println("Внесениот текст е:");
        System.out.println(vnesenTekst);

        // Затварање на Scanner објектот
        scanner.close();
    }
}