import java.util.HashMap;

public class HashMapDemo {

    public static void Demo() {

        // Skapar en ny tom Map
        HashMap<String, String> capitalMap = new HashMap<String, String>();

        // Populera Map
        capitalMap.put("Sweden", "Stockholm");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");

        HashMap<String, Integer> populationMap = new HashMap<>();
        populationMap.put("Sweden", 10000000);
        populationMap.put("Denmark", 5000000);
        populationMap.put("France", 67000000);

        System.out.println(
                "The capital of Sweden is: " + capitalMap.get("Sweden")
        );

        System.out.printf(
                "The population in Sweden and Denmark is %d\n",
                populationMap.get("Sweden") + populationMap.get("Denmark")
        );

    }

}
