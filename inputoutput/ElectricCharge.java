import java.util.Scanner;

public class ElectricCharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double eUsed = 0.0, eCharge = 0.0;

        System.out.print("Input Electric used : ");

        eUsed = sc.nextDouble();

        if (eUsed > 200) {
            eCharge += (eUsed - 200) * 9.00;
            eUsed = 200;
        }

        else if ((eUsed > 100) && (eUsed <= 200)) {
            eCharge += (eUsed - 100) * 7.00;
            eUsed = 200;
        }

        if (eUsed <= 100)

            eCharge += eUsed * 5.00;

        System.out.print("Electric used = " + eUsed + " and Your ElecCharge = " + eCharge);

    }
}