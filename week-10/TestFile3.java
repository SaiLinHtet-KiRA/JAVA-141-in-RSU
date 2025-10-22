import java.util.Scanner;
import java.io.*;

class TestFile3 {
    public static void main(String[] args) throws IOException {
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
}