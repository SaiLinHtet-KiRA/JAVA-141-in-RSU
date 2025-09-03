import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        double Tax;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input income: ");

        double income = sc.nextDouble();

        if (income > 10000000)
            Tax = income * 0.3;
        else if (income > 5000000 && income <= 10000000)

            Tax = income * 0.2;
        else if (income > 1000000 && income <= 5000000)
            Tax = income * 0.1;
        else if (income > 500000 && income <= 1000000)
            Tax = income * 0.05;
        else
            Tax = 0;

        System.out.print("Your tax charge: " + Tax);
    }
}