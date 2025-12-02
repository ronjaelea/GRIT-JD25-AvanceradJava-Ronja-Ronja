import java.util.ArrayList;

public class ArrayListDemo {

    public static void Demo() {

        ArrayList<String> bilar = new ArrayList<>();
        bilar.add("Volkswagen");
        bilar.add("Volvo");
        bilar.add("Suzuki");
        bilar.add("Volvo");

        // Skriv ut hela listan
        System.out.println(bilar.toString());

        // Skriv ut en speciell position
        System.out.println(
                "Den bästa bilmodellen är så klart " +
                        bilar.get(2)
        );

        // Ändra en befintlig plats
        bilar.set(3, "Fiat");
        System.out.printf(
                "En klassisk hundkoja är en %s\n",
                bilar.get(3)
        );

        // Ta bort från listan
        bilar.remove(3);
        System.out.println(bilar.toString());

        // Byta plats
        String temp = bilar.get(0);
        bilar.set(0, bilar.get(2));
        bilar.set(2, temp);
        System.out.println(bilar.toString());

        // Loopa igenom listan och skriv ut en "topp-lista"
        for(int i=0; i<bilar.size(); i++) {
            System.out.printf(
                    "%d\t%s\n",
                    i+1,
                    bilar.get(i)
            );
        }

        bilar.clear();
        System.out.println(bilar.toString());
    }

}
