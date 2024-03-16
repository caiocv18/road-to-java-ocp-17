import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100);
        System.out.println(number);
    }
}
