import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Password: ");
        String password = sc.nextLine();

        for(int i= 1;i <=3;i++){
            System.out.print("Login: ");
            String login=sc.nextLine();

           boolean equal= login.equals(password);
           if(i==3){
                System.out.println("Time out");
            }
           if(equal){
               System.out.println("Succesfully log in");
               i=3;
           }
        }
    }
}
