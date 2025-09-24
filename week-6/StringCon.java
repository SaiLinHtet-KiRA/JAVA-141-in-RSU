import java.util.Scanner;

public class StringCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Iput first string: ");
        String firstString=sc.nextLine();
        System.out.print("Iput second string: ");
        String secString = sc.nextLine();

        String conString=firstString.concat(secString);

        System.out.print("Result of concatenate 2 string: "+conString);

    }
}
