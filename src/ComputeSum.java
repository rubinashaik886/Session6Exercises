import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int numInputs=10, sum = 0, input=0, stopLoop=0;

        for (int i = 0; i < numInputs; i++) {
            input = sc.nextInt();
            if (input == stopLoop) {
                sum += input;
                break;
            }
            else {
                sum += input;
            }
        }

        System.out.println("Your sum is: " + sum);

    }
}
