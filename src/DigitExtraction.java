import java.util.Scanner;

public class DigitExtraction {
    // print the digits of a given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        while (number != 0){
            //extract digit
            int digit = number % 10;
            number = number / 10;
            //System.out.println("digit = " + digit);

            System.out.print(digit);
            if(number > 0){
                System.out.print(", ");
            }
        }

    }
}
