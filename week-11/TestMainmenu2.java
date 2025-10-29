import java.util.Scanner;
import java.io.*;

class TestMainmenu2 {
    public static void create() throws IOException {
        Scanner in = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\book.txt"));
        PrintStream out = new PrintStream(new File("G:\\my java\\inputoutput\\week-11\\bookresult.txt"));
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] array_txt = line.split(" ");
            String bid = array_txt[0];
            String bdes = array_txt[1];
            int bamt = Integer.parseInt(array_txt[2]);
            int bprice = Integer.parseInt(array_txt[3]);
            if (bprice > 100) {
                out.println(bid + " " + bdes + " " + bprice);
            }
        }
    }

    public static void print() throws IOException {
        Scanner in = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\book.txt"));
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] array_txt = line.split(" ");
            String bid = array_txt[0];
            String bdes = array_txt[1];
            int bamt = Integer.parseInt(array_txt[2]);
            int bprice = Integer.parseInt(array_txt[3]);
            System.out.print(" id = " + bid);
            System.out.print(" des = " + bdes);
            System.out.print(" amt = " + bamt);
            System.out.print(" price = " + bprice);
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String check = " ";
        while (true) {
            System.out.println("---------------------------");
            System.out.print(" 1. Create book file \n 2. Print book file\n");
            System.out.print("Your option: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Create book file");
                    System.out.println("---------------------------");
                    System.out.println("File is sucessfully created.");

                    create();
                    break;
                case 2:
                    System.out.println("print book file");
                    System.out.println("---------------------------");
                    print();
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            System.out.println("---------------------------");
            System.out.print("Do you want to exit(y/n): ");

            check = sc.next();
            if (check.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
