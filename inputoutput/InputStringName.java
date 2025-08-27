import java.util.Scanner;

public class InputStringName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.print("Please input your name: ");
        name = sc.nextLine();
        System.out.print("Hi, Nice too meet you : " + name);
    }
}
