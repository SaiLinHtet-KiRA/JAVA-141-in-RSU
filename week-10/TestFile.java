import java.util.Scanner;
import java.io.*;

class TestFile {
    public static void main(String[] args) throws IOException {
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
            if (bprice > 100) {
                out.println(bid + " " + bdes + " " + bprice);
            }
        }
    }
}