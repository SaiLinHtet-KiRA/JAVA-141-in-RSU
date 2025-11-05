import java.io.*;

public class WriteData {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("G:\\my java\\week-12\\scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // create file
        output.println("John T Smith");
        output.println(90);
        output.println("Eric K Jones");
        output.println(85);

        // close file
        output.close();
    }

}