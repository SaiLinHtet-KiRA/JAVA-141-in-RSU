import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of salesmen: ");
        int numOfSalemen = sc.nextInt();

        double[][] salesmens = new double[numOfSalemen][5];
        String[] salesmensName = new String[numOfSalemen];

        for (int i = 1; i <= numOfSalemen; i++) {
            System.out.print("Please input ID for " + i + " salesmen: ");
            salesmens[i - 1][0] = sc.nextInt();

            System.out.print("Please input Name for " + i + " salesmen: ");
            salesmensName[i - 1] = sc.next();

            System.out.print("Please input Sales for " + i + " salesmen: ");
            double sales = sc.nextDouble();
            salesmens[i - 1][1] = sales;

            System.out.print("Please input cost for " + i + " salesmen: ");
            double cost = sc.nextDouble();

            salesmens[i - 1][2] = cost;

            double profit = sales - cost;
            salesmens[i - 1][3] = profit;

            salesmens[i - 1][4] = sales >= 5000 ? profit * 0.05 : profit * 0.1;
            System.out.println("------------------------------------ ");
        }
        System.out.println("\tNumbe\tName\tSales\tValue\tProfit\tCommission");
        for (int i = 1; i <= numOfSalemen; i++) {
            for (int z = 1; z <= 5; z++) {
                if (z == 2) {
                    System.out.print("\t" + salesmensName[i - 1]);
                }
                System.out.print("\t" + salesmens[i - 1][z - 1]);
            }
            System.out.println();
        }

    }
}
