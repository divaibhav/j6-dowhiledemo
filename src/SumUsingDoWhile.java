import java.util.Scanner;

public class SumUsingDoWhile {
    /*
    Write a program to sum all the entered
    value until user enter 0 to stop and do not
    sum if any entered value
    it greater than 100.
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
        int count = 0;
        int userInputCounter = 0;
        do {
            System.out.println("enter an integer for sum, enter 0 to stop");
            userInput = scanner.nextInt();
            userInputCounter++;
            if(userInput == 0){
                System.out.println("userInput = " + userInput);
            }
            if(userInput <= 100) {
                sum = sum + userInput;
            }else {
                count++;
            }
        } while (userInput != 0);
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
        System.out.println("userInputCounter = " + userInputCounter);
    }
}
