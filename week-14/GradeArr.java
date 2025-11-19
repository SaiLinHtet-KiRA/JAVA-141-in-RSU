import java.util.Scanner;

public class GradeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for No." + (i + 1) + " student: ");
            scores[i] = sc.nextInt();
        }
        System.out.println("----Result----");
        for (int i = 0; i < n; i++) {
            int score = scores[i];
            if (score >= 80 && score <= 100) {
                System.out.println("No." + (i + 1) + " student grade: A");
            } else if (score >= 70 && score <= 79) {
                System.out.println("No." + (i + 1) + " student grade: B");
            }
            if (score >= 51 && score <= 69) {
                System.out.println("No." + (i + 1) + " student grade:C");
            }
            if (score >= 0 && score <= 50) {
                System.out.println("No." + (i + 1) + " student grade:F");
            }
        }
    }
}
