import java.util.Scanner;

public class CarFinanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car price (baht): ");
        double carprice = sc.nextDouble();

        System.out.print("Enter down payment (%): ");
        double downPaymentPercent = sc.nextDouble();

        System.out.print("Enter interest rate (%): ");
        double intrate_rate = sc.nextDouble();

        System.out.print("Enter payment period (months): ");
        int paymonth = sc.nextInt();

        double financedAmount = carprice - (carprice * (downPaymentPercent / 100));

        double monthlyInstallment = financedAmount / paymonth;

        double monthlyInterest = monthlyInstallment * (intrate_rate / 100);

        double monthlypayment = monthlyInstallment + monthlyInterest;

        double totalpayment = monthlyInterest * paymonth;

        System.out.println("Price of car = " + carprice + " baht");
        System.out.println("Period of payment = " + paymonth + " months");
        System.out.println("Interest rate = " + intrate_rate + " %");
        System.out.println("Total Interest = " + totalpayment + " baht");
        System.out.println("Payment per month = " + monthlypayment + " baht");

    }
}
