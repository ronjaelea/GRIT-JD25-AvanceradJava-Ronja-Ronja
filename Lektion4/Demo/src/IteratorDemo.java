import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void Demo() {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Fiat");
        cars.add("Mazda");
        cars.add("Suzuki");

        Iterator<String> itr = cars.iterator();
        while(itr.hasNext()) {
            String car = itr.next();
            System.out.println(car);
            if(car.equals("Fiat")) {
                itr.remove();
            }
        }
        System.out.println(cars);

    }

}
