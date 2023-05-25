package lubos.sukup.it20222023gui.opakovanie;

import java.time.LocalDate;

public class DruhyMain {
    public static void main(String[] args) {

       Faktura faktura1 = new Faktura("Trekové boty Sedmimílovky", 3, 0.45,
              1800,"7.4.2022",false );

        Faktura faktura3 = new Faktura("Trekové boty Sedmimílovky", 3, 0.45,
                1800,"7.4.2022",true );


        Faktura faktura2 = new Faktura("tricko", 10, 0.100,
                300,"7.4.2022",true );

        System.out.println(faktura1.getNazevZbozi());
        System.out.println(" Cena zasielky je: " + faktura1.celkovaCena()+" CZK");
        System.out.println(" Hmotnost zasielky je: " + faktura1.hmotnostZasielky()+" KG");
        System.out.println(faktura3.getNazevZbozi());
        System.out.println(" Cena zasielky je: " + faktura3.celkovaCena()+" CZK");
        System.out.println(" Hmotnost zasielky je: " + faktura3.hmotnostZasielky()+" KG");
        System.out.println(faktura2.getNazevZbozi());
        System.out.println(" Cena zasielky je: " + faktura2.celkovaCena()+" CZK");
        System.out.println(" Hmotnost zasielky je: " + faktura2.hmotnostZasielky()+" KG");

    }
}
