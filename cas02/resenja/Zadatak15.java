package resenje;

public class Zadatak15 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "";

        int n = 100;
        String pom = "matf";

        long pocetak = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(pom);
        }
        long kraj = System.nanoTime();
        System.out.println("StringBuilder: " + (kraj - pocetak));

        pocetak = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s += pom;
        }
        kraj = System.nanoTime();
        System.out.println("String: " + (kraj - pocetak));
    }

}
