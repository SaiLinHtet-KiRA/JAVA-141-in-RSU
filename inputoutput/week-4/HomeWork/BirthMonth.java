import java.util.Scanner;

public class BirthMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean askInput = true;

        while (askInput) {
            System.out.print("Please input income(monthly): ");
            int month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("The number of month =1 is January");
                    break;
                case 2:
                    System.out.println("The number of month =2 is February");
                    break;
                case 3:
                    System.out.println("The number of month =3 is March");
                    break;
                case 4:
                    System.out.println("The number of month =4 is April");
                    break;
                case 5:
                    System.out.println("The number of month =5 is May");
                    break;
                case 6:
                    System.out.println("The number of month =6 is June");
                    break;
                case 7:
                    System.out.println("The number of month =7 is July");
                    break;
                case 8:
                    System.out.println("The number of month =8 is August");
                    break;
                case 9:
                    System.out.println("The number of month =9 is September");
                    break;
                case 10:
                    System.out.println("The number of month =10 is October");
                    break;
                case 11:
                    System.out.println("The number of month =11 is November");
                    break;
                case 12:
                    System.out.println("The number of month =12 is December");
                    break;
                default:
                    System.out.println("Invalid Month");
            }
            boolean askedKeyAgain = true;
            while (askedKeyAgain) {
                System.out.print("Please input Y (to input month again) or N (to exit): ");

                char askedKey = sc.next().charAt(0);

                if (askedKey == 'N' || askedKey == 'n') {
                    askInput = false;
                }

                if (askedKey == 'N' || askedKey == 'n' || askedKey == 'Y' || askedKey == 'y') {
                    askedKeyAgain = false;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }

        }

    }
}