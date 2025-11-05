import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {

        String filename = "G:\\my java\\week-12\\output.txt";

        try (PrintWriter writer = new PrintWriter(new java.io.File(filename))) {

            writer.println("Hello, this is the first line.");
            writer.println("This is a second line");
            writer.println("and it continues here.");
            writer.printf("The answer is %d.%n", 42);

            System.out.println("Data successfully written to " + filename);

        } catch (FileNotFoundException e) {
            System.out.println("Error : File not found or cannot be created: " + e.getMessage());
        }
    }

}
