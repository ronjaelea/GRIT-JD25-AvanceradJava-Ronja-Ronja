import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println("""
                1. Polymorfism
                2. Interface
                3. Abstract Class
                4. Generics
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
                PolymorfismDemo.Demo();
                break;
            case 2:
                InterfaceDemo.Demo();
                break;
            case 3:
                AbstractDemo.Demo();
                break;
            case 4:
                GenericDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val!");
        }

    }

}
