import java.util.Scanner;

public class GeometryCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean askKeyAgain = true;

    while (askKeyAgain) {
      System.out.println("\n1. Triangle\n2. Square\n3. Exit");
      System.out.print("Input number of choice : ");

      int Key = sc.nextInt();

      switch (Key) {
        case 1:
          System.out.print("Input base of triangle : ");
          double base = sc.nextDouble();

          System.out.print("Input height of triangle : ");
          double height = sc.nextDouble();

          System.out.println("Area of triangle : " + (base * height) / 2);

          break;
        case 2:
          System.out.print("Input side of square : ");
          double side = sc.nextDouble();

          System.out.println("Area of square : " + side * side);

          break;
        case 3:
          askKeyAgain = false;
          break;
        default:
          System.out.println("Invalid number,please choice again!!.");
      }
    }

  }
}
