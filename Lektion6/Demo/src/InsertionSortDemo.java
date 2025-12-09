public class InsertionSortDemo {

    public static void Demo() {

        int[] numbers = { 999, 4, 10, 15, 26, 18, 7, 28, 13};

        System.out.println("Osorterad array");
        printArray(numbers);

        insertionSort(numbers);
        System.out.println("Sorterad array");
        printArray(numbers);
    }

    public static void insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Flyttar alla element som är stärre än "key"
            // ett steg till höger
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Stoppa "key" på rätt position
            arr[j + 1] = key;
        }

    }

    public static void printArray(int[] arr) {
        for(int n: arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
