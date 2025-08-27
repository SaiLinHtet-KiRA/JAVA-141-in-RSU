import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "", career = "", friends = "", addressString = "", age = "", hobby = "", studyMajor = "";

        System.out.print("Please input your name: ");
        name = sc.nextLine();

        System.out.print("Please input your career: ");
        career = sc.nextLine();

        System.out.print("Please input your  friends: ");
        friends = sc.nextLine();
        System.out.print("Please input your age: ");
        age = sc.nextLine();

        System.out.print("Please input your addressString: ");
        addressString = sc.nextLine();

        System.out.print("Please input your hobby: ");
        hobby = sc.nextLine();

        System.out.print("Please input your studing major: ");
        studyMajor = sc.nextLine();

        System.out.println("Hi, Nice to meet you : " + name);
        System.out.println("Your career : " + career);
        System.out.println("Your friends : " + friends);
        System.out.println("Your age : " + age);
        System.out.println("Your addressString: " + addressString);
        System.out.println("Your hobby : " + hobby);
        System.out.println("Your studyMajor : " + studyMajor);

    }
}
