import  java.util.Scanner;

public class Task4 {
     
    static String input; 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
         input = scanner.nextLine();

        StringBuilder reverseWord = new StringBuilder(input).reverse();

        System.out.println( (reverseWord.toString().equals(input)) 
        ? "The input string is a palindrome"
        : "The input string is not a palindrome"
    );
            
        
           
        







        
    }
}
