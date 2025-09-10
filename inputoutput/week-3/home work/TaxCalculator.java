import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input income: ");

        double income = sc.nextDouble();

        double Tax = income > 10000000 ? income * 0.3
                : income > 5000000 && income <= 10000000 ? income * 0.2
                        : income > 1000000 && income <= 5000000 ? income * 0.1
                                : income > 500000 && income <= 1000000 ? income * 0.05 : 0;
        System.out.println("Tax: " + Tax);

    }
}