import java.util.Scanner;

public class SumUsingDoWhile {
    /*
    Write a program to sum all the entered
    value until user enter 0 to stop.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;
        //do while
        /*
        do {
        //statements;
        }while(condition);
         */
        do {
            System.out.println("enter an integer for sum, enter 0 to stop");
            userInput = scanner.nextInt();
            sum = sum + userInput;
        } while (userInput != 0);
    }
}
