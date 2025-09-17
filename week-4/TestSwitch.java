import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = 0;

        System.out.print("input code : ");
        code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("This is test case 1 :)  ");
                break;
            case 2:
                System.out.println("This is test case 2 >< ");
                break;
            default:
                System.out.println(" not in any case  Good Bye  (^__^) ");
        }
        System.out.print("this is out of switch ");
    }
}
