import java.util.Scanner;
import java.io.*;

class test {
    public static void main(String[] args) throws IOException {
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
            if (csts.equalsIgnoreCase("csvip")) {
                out.println(cid + " " + cname + " " + csts);
            }
        }
    }
}