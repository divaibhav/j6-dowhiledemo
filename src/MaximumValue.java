import java.util.Scanner;

public class MaximumValue {
    /*
    Write a program to print the maximum value from all the
    given input,
     until user enter 0 to stop.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        int userInput;
        do {
            System.out.println("enter an integer, enter 0 to stop");
            userInput = scanner.nextInt();
            if (userInput > maximum) {
                maximum = userInput;
            }
        } while (userInput != 0);

        System.out.println("maximum value = " + maximum);
    }
}
