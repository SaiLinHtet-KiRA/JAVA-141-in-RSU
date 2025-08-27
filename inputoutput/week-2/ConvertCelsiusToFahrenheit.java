import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is celsius degree: ");
        int celsius = sc.nextInt();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.print("So temperature in fahrenheit is : " + fahrenheit);

    }
}
