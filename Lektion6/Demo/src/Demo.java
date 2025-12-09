
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("""
                1. Insertion Sort
                2. Merge Sort
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
                InsertionSortDemo.Demo();
                break;
            case 2:
                MergeSortDemo.Demo();
                break;

            default:
                System.out.println("Ogiltigt val");
        }
    }

}
