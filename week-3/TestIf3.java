import java.util.Scanner;

public class TestIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input student grade: ");

        int studentGrade = sc.nextInt();

        if (studentGrade >= 90)

            System.out.println("A");

        else if (studentGrade >= 80)

            System.out.println("B");

        else if (studentGrade >= 70)

            System.out.println("C");

        else if (studentGrade >= 60)

            System.out.println("D");

        else

            System.out.println("F");
    }
}
