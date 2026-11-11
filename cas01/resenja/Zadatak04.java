package cas01;

import java.util.Scanner;

public class Zadatak04 {

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        if (ulaz.hasNextInt()) {
            int x = ulaz.nextInt();
            System.out.println("Ceo broj: " + x);
        }

        if (ulaz.hasNextDouble()) {
            double d = ulaz.nextDouble();
            System.out.println("Realan broj: " + d);
        }

        if (ulaz.hasNext()) {
            String s = ulaz.next();
            System.out.println("Niska: " + s);
        }

        if (ulaz.hasNext()) {
            String pom = ulaz.next();
            char c = pom.charAt(0);
            System.out.println("Karakter: " + c);
        }

        ulaz.close();
    }
}
