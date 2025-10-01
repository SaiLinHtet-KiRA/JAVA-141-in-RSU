import java.util.Scanner;

public class PatientAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input patient's age: ");
        int age = sc.nextInt();

        if (age < 10) {
            System.out.print("Eat half a teaspoon");

        } else {
            System.out.print("Eat 1 teaspoon slowly!");
        }
    }

}