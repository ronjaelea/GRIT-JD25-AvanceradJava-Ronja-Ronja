import java.util.LinkedList;

public class LinkedListDemo {

    public static void Demo() {

        // Skapar en ny tom lista
        LinkedList<String> top10MetalBands = new LinkedList<>();

        // LinkedList har de flesta metoderna som ArrayList har:
        // .add(), .get(), .size(), .remove(), .clear() mf

        top10MetalBands.add("Metallica");
        top10MetalBands.add("Iron Maiden");
        System.out.println(top10MetalBands);

        top10MetalBands.addFirst("Within Temptation");
        top10MetalBands.addLast("Lordi");
        System.out.println(top10MetalBands);

        top10MetalBands.removeFirst();
        top10MetalBands.remove(top10MetalBands.size()/2); // Mitten
        top10MetalBands.add(1, "Halestorm"); // Add on index=1
        System.out.println(top10MetalBands);
    }

}
