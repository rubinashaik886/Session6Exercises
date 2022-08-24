import java.util.Scanner;
import java.lang.Math.*;

public class SquareRootWhile {
    public static void main(String args[])
    {
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        while (number != -1 && number > 0) {
            System.out.println("The square root of the number is " + Math.sqrt(number));
            System.out.println("Type a non-negative integer: ");
            number = console.nextInt();

        }

        System.out.println("Invalid number try again");
        number = console.nextInt();

    }

}
