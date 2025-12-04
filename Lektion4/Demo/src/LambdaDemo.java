import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {

    public static void Demo() {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.forEach(new PrintDemoClass());
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer intValue) {
                System.out.println(intValue);
            }
        });
        numbers.forEach(intValue -> System.out.println(intValue));
        numbers.forEach(System.out::println);
    }

}

class PrintDemoClass implements Consumer<Integer> {
    @Override
    public void accept(Integer intValue) {
        System.out.println(intValue);
    }
}
