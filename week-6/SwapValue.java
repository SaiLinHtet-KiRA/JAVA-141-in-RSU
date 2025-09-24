import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Iput x value in number: ");
        int x=sc.nextInt();
        System.out.print("Iput y value in number: ");
        int y = sc.nextInt();

        System.out.println("Before: x="+x+" , y= "+ y);
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After: x=" + x + " , y= " + y);

    }
}
