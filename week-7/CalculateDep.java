import java.util.Scanner;

public class CalculateDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input cost: ");
        double cost = sc.nextDouble();
        System.out.print("Input depreciation (%): ");
        double depreciationPer = sc.nextDouble();
        System.out.println("Year \tCost \tDepreciation \tnetCost");
        for (int i = 1; i <= 5; i++) {
            double depreciation = cost * (depreciationPer / 100);
            double newCost = cost - depreciation;

            System.out.println(i + " \t" + cost + "\t   " + depreciation + "\t" + newCost);
            cost = newCost;
        }
    }
}
