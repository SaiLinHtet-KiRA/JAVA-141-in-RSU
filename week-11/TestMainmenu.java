import java.util.Scanner;

class TestMainmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String check = " ";
        while (true) {
            System.out.print(" 1. Create book file \n 2. Print book file\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Create book file");
                    break;
                case 2:
                    System.out.print("print book file");
                    break;
                default:
                    System.out.println("default");
                    break;
            }// end switch

            System.out.print("Do you want to exit(y/n)");
            check = sc.next();
            if (check.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
