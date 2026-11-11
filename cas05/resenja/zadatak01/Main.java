package cas05.zadatak01;

public class Main {

    static void main() {
        Singleton s1 = Singleton.getInstanca();
        System.out.println(s1.opis());

        Singleton s2 = Singleton.getInstanca();
        if (s1 == s2) {
            System.out.println("Isti objekat je u pitanju!");
        }
    }

}
