public class MergeSortDemo {

    public static void Demo() {
        int[] numbers = {22, 74, 67, 4, 8, 27, 100, 50, 4 };

        System.out.println("Före sortering");
        InsertionSortDemo.printArray(numbers);

        mergeSort(numbers);

        System.out.println("Efter sortering");
        InsertionSortDemo.printArray(numbers);
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // En array med 0 eller 1 element är redan sorterad
        }

        int mid = arr.length / 2;

        // Skapa 2 arrayer med rätt storlek
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        // slå ihop
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right){
        int indexLeft = 0;
        int indexRight = 0;
        int indexArr = 0;

        // Jämför elementen från både left & right - lägg in det sista
        while(indexLeft < left.length && indexRight < right.length) {
            if(left[indexLeft] <= right[indexRight]) {
                arr[indexArr++] = left[indexLeft++];
            } else {
                arr[indexArr++] = right[indexRight++];
            }
        }
        // Om det finns värden kvar i vänstra delen - flytta dessa
        while(indexLeft < left.length) {
            arr[indexArr++] = left[indexLeft++];
        }
        // Om det finns värden kvar i höger delen - flytta dessa
        while(indexRight < right.length) {
            arr[indexArr++] = right[indexRight++];
        }

    }

}
