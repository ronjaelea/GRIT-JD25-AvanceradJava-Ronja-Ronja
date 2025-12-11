
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("""
                1. Start Thread by Inheritance
                2. Start Thread by Interface
                3. Start Thread by Lambda
                4. Race Condition Demo
                5. Synchronized Demo
                """);
        System.out.println("Demo: ");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(i) {
            case 1:
                StartThreadByInheritanceDemo.Demo();
                break;
            case 2:
                StartThreadByInterfaceDemo.Demo();
                break;
            case 3:
                StartThreadByLambdaDemo.Demo();
                break;
            case 4:
                RaceConditionDemo.Demo();
                break;
            case 5:
                SynchronizedDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val");
        }
    }

}
