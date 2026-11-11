package cas05.zadatak01;

public class Singleton {
    private static Singleton instanca = null;

    private Singleton() {}

    public static Singleton getInstanca() {
        if (instanca == null) {
            instanca = new Singleton();
        }
        return instanca;
    }

    public String opis() {
        return "Jedinstveni objekat klase Singleton!";
    }
}
