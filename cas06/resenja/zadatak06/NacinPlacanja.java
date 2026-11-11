package cas06.zadatak06;

public interface NacinPlacanja {
    boolean plati(double iznos);

    default void ispisiRezultat(NacinPlacanja p, int iznos) {
        if (p.plati(iznos)) {
            System.out.println("Transakcija je uspjesna");
        } else {
            System.out.println("Transakcija je neuspjesna!!!");
        }
    }
}
