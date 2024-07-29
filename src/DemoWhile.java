import java.util.Scanner;

public class DemoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number = scanner.nextInt();
        System.out.println("number = " + number);
        int digitCount = 0;
        while(number > 0){
            number = number / 10;
            digitCount++;
        }
        System.out.println("digitCount = " + digitCount);
    }
}
