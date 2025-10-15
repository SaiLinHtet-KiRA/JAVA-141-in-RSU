import java.util.Scanner;

public class Practice1 {

    static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    static double average(int sum) {
        return (double) sum / 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Please input integer for " + i + " value: ");
            num[i - 1] = sc.nextInt();
        }

        int sum = sum(num);
        double average = average(sum);

        System.out.println("Total value: " + sum);
        System.out.println("Average value: " + average);

    }
}
