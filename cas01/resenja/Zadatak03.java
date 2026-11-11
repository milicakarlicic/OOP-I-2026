package cas01;

public class Zadatak03 {

    static int saberi(int x, int y) {
        return x + y;
    }

    static void ispisi(int x, int y, int z) {
        System.out.println(x + " + " + y + " = " + z);
        x++;
    }

    static void main() {
        int x = 10, y = 5;

        int rezultat = saberi(x, y);
        System.out.println(x);

        ispisi(x, y, rezultat);
        System.out.println(x);
    }
}
