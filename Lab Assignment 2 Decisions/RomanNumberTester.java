import java.util.Scanner;

public class RomanNumberTester {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = num.nextInt();

        RomanNumberConversion.integerToRoman(number);
    }
}
