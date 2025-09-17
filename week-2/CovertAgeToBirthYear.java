import java.util.Scanner;

public class CovertAgeToBirthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age: ");
        int age = sc.nextInt();
        int birthYear = 2025 - age;

        System.out.print("So your birth year is: " + birthYear);
    }
}
