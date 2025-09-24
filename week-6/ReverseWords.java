import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Please input string: ");
        String text=sc.nextLine();

        System.out.print("Reverse String list : ");

        for(int i= text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
}
