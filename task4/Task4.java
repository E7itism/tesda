import  java.util.Scanner;

public class Task4 {
     
    static String input; 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
         input = scanner.nextLine();

        StringBuilder reverseInput = new StringBuilder(input).reverse();

        if(reverseInput.toString().equals(input))
            System.out.println("The input string is a palindrome");
        else
            System.out.println("The input string is not a palindrome");

        







        
    }
}
