package inputoutput;

import java.util.Scanner;

public class TourTravel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of trip member: ");
        int member = sc.nextInt();

        System.out.print("Input travel price / person : ");
        int price = sc.nextInt();
        double total;
        if (member > 8) {
            total = (price * 8) + ((member - 8) * (price - (0.05 * price)));
        } else
            total = price * member;
        System.out.println("Your group number = " + member + " Person");
        System.out.println("Your total payment charge = " + total + " baht");
    }
}
