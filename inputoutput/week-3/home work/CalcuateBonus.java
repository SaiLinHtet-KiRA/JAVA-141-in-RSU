import java.util.Scanner;

public class CalcuateBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Input Worked Year: ");
        int WorkedYear = sc.nextInt();

        double bonus = 0;

        if (WorkedYear > 16) {
            bonus = salary * 0.4;
        } else if (WorkedYear >= 6 && WorkedYear <= 15) {
            bonus = salary * 0.2;
        } else if (WorkedYear >= 1 && WorkedYear <= 5) {

            bonus = salary * 0.1;
        }

        System.out.println("Bonus: " + bonus);
    }
}
