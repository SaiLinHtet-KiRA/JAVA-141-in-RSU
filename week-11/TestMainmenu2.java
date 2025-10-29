import java.util.Scanner;
import java.io.*;

class TestMainmenu2 {
    public static void book() throws IOException {
        Scanner in = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\book.txt"));
        PrintStream out = new PrintStream(new File("G:\\my java\\inputoutput\\week-10\\bookresult.txt"));
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

            if (bprice > 100) {
                out.println(bid + " " + bdes + " " + bprice);
            }
        }
    }

    public static void customer() throws IOException {
        Scanner in = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\customer.txt"));
        PrintStream out = new PrintStream(new File("G:\\my java\\inputoutput\\week-10\\custvip.txt"));
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] array_txt = line.split(" ");
            String cid = array_txt[0];
            String cname = array_txt[1];
            String csurname = array_txt[2];
            String cadd = array_txt[3];
            String ctel = array_txt[4];
            String csts = array_txt[5];
            System.out.println(" id = " + cid);
            System.out.print(" des = " + cname);
            System.out.print(" amt = " + csts);
            System.out.println();
            if (csts.equalsIgnoreCase("csvip")) {
                out.println(cid + " " + cname + " " + csts);
            }
        }
    }

    public static void transaction() throws IOException {
        Scanner in2 = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\book.txt"));
        Scanner in3 = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\transaction.txt"));
        PrintStream out = new PrintStream(new File("G:\\my java\\inputoutput\\week-10\\custbuy.txt"));
        while (in3.hasNext()) {
            String line = in3.nextLine();
            String[] array_txt = line.split(" ");
            String tid = array_txt[0];
            String tdate = array_txt[1];
            String tcid = array_txt[2];
            String tbid = array_txt[3];
            String tamt = array_txt[4];
            String tsts = array_txt[5];
            String cname = readcust(tcid);
            System.out.println(" id = " + tid);
            System.out.print(" tdate = " + tdate);
            System.out.print(" tcid = " + tcid);
            System.out.print(" tbid = " + tbid);
            System.out.print(" tamt = " + tamt);
            System.out.print(" tsts = " + tsts);
            System.out.println();

            if (tsts.equalsIgnoreCase("buy")) {
                out.println(tdate + "\t" + cname + "\t" + tsts);
            }
        }
    }

    static public String readcust(String cid) throws IOException {
        Scanner in1 = new Scanner(new File("G:\\my java\\inputoutput\\week-10\\customer.txt"));
        while (in1.hasNext()) {
            String line = in1.nextLine();
            String[] array_txt = line.split(" ");
            String id = array_txt[0];
            if (id.equals(cid)) {
                String cname = array_txt[1];
                return cname;
            }
        }
        return " ";
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String check = " ";
        while (true) {
            System.out.println("---------------------------");
            System.out.print(" 1. Book Management\n 2. Customer Management\n 3. Transaction Management\n");
            System.out.print("Your option: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Book Management");
                    System.out.println("---------------------------");

                    book();
                    break;
                case 2:
                    System.out.println("Customer Management");
                    System.out.println("---------------------------");
                    customer();
                    break;
                case 3:
                    System.out.println("3. Transaction Management");
                    System.out.println("---------------------------");
                    transaction();
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
