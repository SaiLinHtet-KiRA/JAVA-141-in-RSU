import java.util.Scanner;

public class CalculateBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalBonus = 0;
        for (int i = 1; i <= 5; i++) {

            double bonus = 0;
            System.out.print("Input " + i + " person salary: ");
            double salary = sc.nextDouble();

            System.out.print("Input " + i + " person worked year: ");
            double workedYear = sc.nextDouble();
            if (workedYear >= 16) {
                bonus = salary * 0.3;
            } else if (workedYear >= 6 && workedYear <= 15) {
                bonus = workedYear * 0.2;
            } else if (workedYear >= 1 && workedYear <= 5) {
                bonus = workedYear * 0.1;
            }
            totalBonus += bonus;
        }
        System.out.println("total bonus: " + totalBonus);
    }

}
