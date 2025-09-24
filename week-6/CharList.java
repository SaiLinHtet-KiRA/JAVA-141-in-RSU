import java.util.Scanner;

public class CharList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Please input string: ");
        String text=sc.nextLine();

        System.out.println("Character list in string is ->");

        for(int i=0;i<text.length();i++){
            System.out.println("\t"+text.charAt(i));
        }
    }
}
