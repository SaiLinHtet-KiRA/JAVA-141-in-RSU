import java.util.Scanner;

class TestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        System.out.print("input array size : ");
        k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            System.out.print("array index = " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int skey = 10;
        for (int i = 0; i < k; i++) {
            if (skey == arr[i])
                System.out.println("found at index : " + i);
        }
    }
}
