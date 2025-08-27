import java.util.Scanner;

public class ComputeAreaAndCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer of radiant : ");
        int radiant = sc.nextInt();

        double area = (double) Math.PI * (radiant * radiant);
        double circle = (double) 2 * Math.PI * radiant;

        System.out.print("So area of radiant is : " + area + " and circle =" + circle);

    }
}
