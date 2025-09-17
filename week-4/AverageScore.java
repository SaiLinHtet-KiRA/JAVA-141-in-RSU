import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        double sum = 0.0, average = 0.0, score = 0.0;
        int count;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input count : ");
        count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Input Score : ");
            score = sc.nextDouble();
            sum = sum + score;
        }
        average = sum / count;
        System.out.print(average);

    }
}
