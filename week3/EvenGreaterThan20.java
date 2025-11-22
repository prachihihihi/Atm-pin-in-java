import java.util.Scanner;

public class EvenGreaterThan20 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number;


       System.out.println("Enter 10 integers:");


       for (int i = 1; i <= 10; i++) {
           number = input.nextInt();
           if (number % 2 == 0 && number > 20) {
               System.out.println(number);
           }
       }


       input.close();
   }
}
