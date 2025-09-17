import java.util.Scanner;

public class CheckAllWordsAreVowels {
  
   static boolean checkVowels(String text){
      for(int i=0;i <text.length();i++){
        char ch=text.charAt(i);
        if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
          
        return false;
        }
      }
      return true;
      
    };
  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Input a string: ");
      String text=sc.nextLine().toLowerCase();
      boolean allAreVowels=checkVowels(text);
      
       System.out.print("Check all the characters of the said string are vowels or not!\n\t "+ allAreVowels);
  }
}