import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {

        int userPin = 132;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number: ");
        int pin = sc.nextInt();

        while (pin != userPin) {

            System.out.println("Your pin is incorrect try again: ");
            pin = sc.nextInt();

            if (pin == userPin) {
                System.out.println("Your pin is correct");
                break;
            }

        }

        System.out.println("Your pin is correct");


    }
}
