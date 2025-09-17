import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input an integer: ");
    String text = sc.nextLine();
    int sum = 0;
    for (int i = 0; i < text.length(); i++) {
      sum += Integer.parseInt(text.charAt(i) + "");
    }
    System.out.print("The sum is: " + sum);
  }
}