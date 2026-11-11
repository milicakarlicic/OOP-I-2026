package cas02;

import java.util.Scanner;

public class Zadatak13 {

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();
        String[] reci = linija.split(" ");
        for (String rec : reci) {
            System.out.println(rec);
        }

        ulaz.close();
    }
}
