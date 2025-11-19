import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input product price: ");
        int product = sc.nextInt();
        System.out.print("Input payment: ");
        int payment = sc.nextInt();

        int change = payment - product;

        int[] bills = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int step = 1;
        for (int b : bills) {
            if (change >= b) {
                System.out.println("\t" + step + ". " + b + "=" + (change / b));
                step++;
                change = change % b;
            }
        }

    }

}
