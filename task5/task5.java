import java.util.*;


public class task5 {



    public static void main(String[] args) {
        List <Integer> numArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter first number ");
         int firstNum = sc.nextInt();
         numArr.add(firstNum);

         System.out.print("Enter second number ");
         int secondNum = sc.nextInt();
         numArr.add(secondNum);
        
         System.out.print("Enter third number ");
         int thirdNum = sc.nextInt();
         numArr.add(thirdNum);

         Collections.sort(numArr);
         if(firstNum == secondNum && secondNum == thirdNum) {
             System.out.println("All numbers are equal");
             System.out.println(numArr);
         } else {
             System.out.println("Numbers arent equal");
             System.out.println(numArr);

            }
            
            
         

    }
    
}
