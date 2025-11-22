import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        Scanner input = new Scanner(System.in);

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.print("Enter your PIN: ");
            int enteredPin = input.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted");
                break;
            } else {
                if (attempt < MAX_ATTEMPTS) {
                    System.out.println("Incorrect PIN, try again");
                } else {
                    System.out.println("Account locked");
                }
            }
        }

        input.close();
    }
}

