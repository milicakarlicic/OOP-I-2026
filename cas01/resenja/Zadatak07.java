package cas01;

import java.util.Scanner;

public class Zadatak07 {

    static void main() {
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        ulaz.close();
    }
}
