import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Deposit account: ");
        double balance=sc.nextDouble();

        System.out.print("Number of deposit year: ");
        int year = sc.nextInt();

        System.out.print("Interest %: ");
        double interest = sc.nextDouble();

        for(int i=1;i<= year;i++){
            System.out.println("Year "+i+" : "); 
            balance +=balance* (interest/100);
            System.out.println("\tYour current balance: "+ balance);
        }
    }
}
