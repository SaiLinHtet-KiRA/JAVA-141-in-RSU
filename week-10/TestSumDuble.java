import java.util.Scanner;

class TestSumDouble {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("input number of double  value :");
    int n = 0;
    double sum = 0;
    n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.print("Input double value : ");
      sum += sc.nextDouble();
    }
    System.out.print("Average = " + (sum / n));
  }
}
