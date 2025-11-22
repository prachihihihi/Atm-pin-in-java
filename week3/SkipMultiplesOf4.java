import java.util.Scanner;

public class SkipMultiplesOf4 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");


       int number = input.nextInt();
       for (int i = 1; i <= number; i++) {
           if (i % 4 == 0) {
               continue;
           }
           System.out.println(i);
       }
      
       input.close();
   }
}