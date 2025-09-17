import java.util.Scanner;

public class MiddleCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input a string: ");
    String text = sc.nextLine();
    int wordCount = text.length();

    if (wordCount % 2 == 0) {
      String middleWords = "" + text.charAt((wordCount / 2) - 1) + text.charAt(wordCount / 2);
      System.out.print("Expected Output: " + middleWords);
    } else {
      char middleWord = text.charAt(wordCount / 2);
      System.out.print("Expected Output: " + middleWord);
    }
  }
}