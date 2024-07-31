import java.util.Scanner;

public class SumOfPowerOfDigits {
    // count the even digits in the number given by user
    // sum of power of digits
    // 1234
    // 1^2 + 2^3 + 3^4 + 4^0
    // Math.pow(x,y); x^y
    // Math.pow(1,2); --> returns a double values
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        double sum = 0;
        int power = 0;
        int digit = 0;
        while (number != 0){
            // 3456
            // digit - 6, power 0
            // digit 5, power 6
            digit = number % 10;
            sum = sum + Math.pow(digit, power);
            number = number / 10;
            power  = digit;
        }
    }

}
