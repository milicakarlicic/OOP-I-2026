package cas01;

import java.util.Scanner;

public class Zadatak08 {

    static int fibonaciRekurzivno(int n) {
        if (n > 30 || n < 0) {
            System.err.println("Nevalidna vrednost za n!");
            System.exit(1);
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonaciRekurzivno(n - 1) + fibonaciRekurzivno(n - 2);
    }

    static int fibonaciIterativno(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int f1 = 1, f2 = 1;
        int pom;
        for (int i = 3; i <= n; i++) {
            pom = f1;
            f1 = f2;
            f2 = pom + f2;
        }

        return f2;
    }

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        int n = ulaz.nextInt();
        System.out.println(fibonaciRekurzivno(n));
        System.out.println(fibonaciIterativno(n));

        ulaz.close();
    }
}
