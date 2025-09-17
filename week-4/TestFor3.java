import java.util.Scanner;

public class TestFor3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("input num: ");
        num = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
