class TestArrayMethod {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 8, 9 };
        printArray(arr);
        searchArray(arr, 5);
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("array [" + i + "] = " + a[i]);
        }
    }

    static void searchArray(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i])
                System.out.print("Found " + search + " at index " + i);
        }
    }
}
