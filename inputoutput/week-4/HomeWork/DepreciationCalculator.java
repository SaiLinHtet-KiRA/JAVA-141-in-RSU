import java.util.Scanner;

public class DepreciationCalculator {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Input depreciation cost(%) : ");
    double depreciationCost = sc.nextDouble();

    System.out.print("Input product price : ");
    double product_price = sc.nextDouble();

    System.out.println("Year\t product_price\t depreciation\t net_cost");

    int year = 1;
    double depreciation = 1, net_cost = 0;

    while (year<=5) {

      depreciation = product_price * (depreciationCost / 100);

      net_cost = product_price - depreciation;

      System.out.println(
          "  " + year + "\t  " + String.format("%.2f", product_price) + "\t  " + String.format("%.2f", depreciation)
              + "\t  " + String.format("%.2f", net_cost));
      product_price = net_cost;
      year++;
    }
  }
}
