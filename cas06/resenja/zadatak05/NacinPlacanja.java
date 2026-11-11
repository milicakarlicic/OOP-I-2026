package cas06.zadatak05;

public interface NacinPlacanja {
    boolean plati(double iznos);

    default void ispisiRezultat(NacinPlacanja p, int iznos) {
        if (p.plati(iznos)) {
            System.out.println("Transakcija je uspesna!");
        } else {
            System.out.println("Transakcija je neuspesna!!!");
        }
    }
}
