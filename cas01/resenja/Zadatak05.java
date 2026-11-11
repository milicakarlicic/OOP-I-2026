package cas01;

import java.util.Scanner;

public class Zadatak05 {

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        int suma = 0;
        int x = ulaz.nextInt();
        while (x != 0) {
            suma += x;
            x = ulaz.nextInt();
        }

        System.out.println(suma);

        ulaz.close();
    }
}
