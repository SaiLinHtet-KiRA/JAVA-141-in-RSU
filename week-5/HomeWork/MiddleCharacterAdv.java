//This is the another version of MiddleCharacter!!

import java.util.Scanner;

public class MiddleCharacterAdv {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input a string: ");
    String text = sc.nextLine();

    if (text.length() % 2 != 0) {
      System.out.print("Expected Output: " + text.charAt(text.length() / 2));
    } else {
      System.out.print("Expected Output: " + text.charAt((text.length() / 2) - 1) + text.charAt(text.length() / 2));
    }
  }
}