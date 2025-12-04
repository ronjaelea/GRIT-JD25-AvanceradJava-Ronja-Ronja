import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println("""
                1. ArrayList
                2. LinkedList
                3. HashSet
                4. HashMap
                5. Iterator
                6. Lambda
                7. Stream
                Välj demo: """);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(choice) {
            case 1:
                ArrayListDemo.Demo();
                break;
            case 2:
                LinkedListDemo.Demo();
                break;
            case 3:
                HashSetDemo.Demo();
                break;
            case 4:
                HashMapDemo.Demo();
                break;
            case 5:
                IteratorDemo.Demo();
                break;
            case 6:
                LambdaDemo.Demo();
                break;
            case 7:
                StreamDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val!");
        }

    }

}
