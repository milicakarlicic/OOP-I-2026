package cas01;

import java.util.Scanner;

public class Zadatak09 {

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        char c = ulaz.next().charAt(0);
        if (Character.isDigit(c)) {
            System.out.println("U pitanju je cifra i njena numericka vr. " +
                    "pomnozena brojem 2 je: " +
                    (Character.getNumericValue(c) * 2));
        }

        ulaz.close();
    }
}
