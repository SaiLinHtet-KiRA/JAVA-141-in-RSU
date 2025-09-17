import java.util.Scanner;

public class countVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input the string: ");
    String text = sc.nextLine().toLowerCase();
    int numberOfVowels = 0;
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        numberOfVowels++;
      }

    }
    System.out.print("Number of Vowels in the string: " + numberOfVowels);
  }
}