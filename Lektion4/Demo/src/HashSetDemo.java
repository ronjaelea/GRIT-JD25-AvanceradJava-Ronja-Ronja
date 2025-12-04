import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

    public static void Demo() {

        // Skapa ett nytt tomt Set
        HashSet<String> fruitSet = new HashSet<>();

        // Vi stoppar in lite värden i den
        fruitSet.add("Banan");
        fruitSet.add("Melon");
        fruitSet.add("Kiwi");
        fruitSet.add("Melon");
        System.out.println(fruitSet);

        System.out.println("Skriv din favorit frukt (3 gånger): ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++) {
            String fruit = sc.nextLine();
            if(fruitSet.contains(fruit)) {
                System.out.println("Frukten finns redan i listan");
            } else {
                System.out.println("Frukten är ny!");
                fruitSet.add(fruit);
            }
        }


    }

}
