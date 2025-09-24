import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Input long side: ");
        int longSide=sc.nextInt();

        System.out.print("Input width side: ");
        int widthSide=sc.nextInt();

        System.out.println("Square size " + widthSide +"x"+ longSide +" are as");
        for(int i=0;i< longSide;i++){
            for (int j = 0; j < widthSide; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
