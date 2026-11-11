package cas01;

import java.util.Scanner;

public class Zadatak10 {

    // pi : 180 = r : s
    static double radijaniUStepene(double r) {
        return 180 * r / Math.PI;
    }

    static double stepeniURadijane(double s) {
        return s * Math.PI / 180;
    }

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        double stepen = ulaz.nextDouble();
        double radijan = Math.toRadians(stepen);

        System.out.printf("sin(%.2f) = %.2f\n", stepen, Math.sin(radijan));
        System.out.printf("cos(%.2f) = %.2f\n", stepen, Math.cos(radijan));
        System.out.printf("tg(%.2f) = %.2f\n", stepen, Math.tan(radijan));
        System.out.printf("ctg(%.2f) = %.2f\n", stepen, Math.cos(radijan) / Math.sin(radijan));

        ulaz.close();
    }
}
