import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int product;

        for (int i = 0; i <= 12; i++) {
            product = num * i;
            System.out.println(num + " * " + i + " = " + product);
        }



    }

}
