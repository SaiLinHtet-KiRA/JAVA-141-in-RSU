import java.util.Scanner;

public class ShowHistogram {
    public static void main(String[] args) {
        int[] h = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < h.length; i++) {
            System.out.print("input list of histogram value: ");
            h[i] = sc.nextInt();
        }
        printhistogram(h);
    }

    public static void printhistogram(int[] h) {
        System.out.println("element\tvalue\thistogram");
        for (int i = 0; i < h.length; i++) {
            System.out.print(i + "\t" + h[i] + "\t");
            for (int z = 0; z < h[i]; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}