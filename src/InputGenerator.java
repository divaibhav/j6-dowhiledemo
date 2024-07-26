import java.util.Random;

public class InputGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.print(random.nextInt(1000) + " " );
            if(i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
