import java.util.Scanner;

public class TaxCalculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Please input income(monthly): ");
    double monthlyIncome = sc.nextDouble();

    int month = 1;
    double totalIncome = 0;

    while (month <= 12) {

      totalIncome += monthlyIncome;
      System.out.println("Month " + month + ": " + totalIncome);
      month++;
    }
    System.out.println("So, your total income: " + totalIncome);
    double Tax = 0;

    if (totalIncome >= 4000000) {
      Tax = totalIncome * 0.37;
    } else if (totalIncome >= 1000000 && totalIncome < 4000000) {
      Tax = totalIncome * 0.3;
    } else if (totalIncome >= 500000 && totalIncome < 1000000) {
      Tax = totalIncome * 0.2;
    } else if (totalIncome >= 100000 && totalIncome < 500000) {
      Tax = totalIncome * 0.1;
    } else if (totalIncome <= 100000) {
      Tax = totalIncome * 0.05;
    }
    System.out.println("Your tax : " + Tax);
  }
}