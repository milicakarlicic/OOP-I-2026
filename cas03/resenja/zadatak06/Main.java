package cas03.zadatak06;

import cas03.zadatak06.model.Brojac;
import cas03.zadatak06.model.Odrzavanje;

public class Main {

    static void main() {
        Brojac b = new Brojac();
        System.out.println(b.opis());

        b.uvecaj();
        b.uvecaj();
        System.out.println(b.opis());

        Odrzavanje.pripremi(b);
        System.out.println(b.opis());
    }

}
