import java.util.Scanner;

public class TestIf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input student grade: ");

        int studentGrade = sc.nextInt();

        if (studentGrade >= 60) {
            System.out.print("Pass !!");
        }
    }
}
