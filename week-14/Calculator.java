import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out
                    .print("...RSU Calculator...\n\t1.Plus\n\t2.Subtract\n\t3.Multiply\n\t4.Divide\nChoose(0=exit): ");
            int choose = sc.nextInt();
            if (choose == 0) {
                break;
            }
            switch (choose) {
                case 1:
                    Plus();
                    break;
                case 2:
                    Subtract();
                    break;
                case 3:
                    Multiply();
                    break;
                case 4:
                    Divde();
                    break;
                default:
                    MainMenu();
                    break;
            }
            System.out.print("continue?(y/n): ");
            String exit = sc.next();
            if (exit.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void Plus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Plus---");
        System.out.print("Input Variable 1: ");
        double var1 = sc.nextDouble();
        System.out.print("Input Variable 2: ");
        double var2 = sc.nextDouble();
        System.out.println("Result= " + (var1 + var2));

    }

    public static void Subtract() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Subtract---");
        System.out.print("Input Variable 1: ");
        double var1 = sc.nextDouble();
        System.out.print("Input Variable 2: ");
        double var2 = sc.nextDouble();
        System.out.println("Result= " + (var1 - var2));
    }

    public static void Multiply() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Multiply---");
        System.out.print("Input Variable 1: ");
        double var1 = sc.nextDouble();
        System.out.print("Input Variable 2: ");
        double var2 = sc.nextDouble();
        System.out.println("Result= " + (var1 * var2));
    }

    public static void Divde() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Divde---");
        System.out.print("Input Variable 1: ");
        double var1 = sc.nextDouble();
        System.out.print("Input Variable 2: ");
        double var2 = sc.nextDouble();
        System.out.println("Result= " + (var1 / var2));
    }

}
