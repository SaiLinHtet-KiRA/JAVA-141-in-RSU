import java.util.Scanner;

public class ComputeSqrtandPowerofIntValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input integer n : ");
        int number = sc.nextInt();

        double Sqrt = Math.sqrt(number);
        int power = number * number;

        System.out.print("So Sqrt of n = " + Sqrt + " and power of n = " + power);

    }
}
