import java.util.Scanner;

public class ReturnTaxRunner {

    public static void main(String[] args) {
        System.out.println("If you are single enter '1' or enter '2':");

        int Income;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("Enter the income in dollar:");
        Income = sc.nextInt();
        sc.close();
        ReturnTax tx = new ReturnTax();
        double ReturnTaxRunner = tx.calculator(c, Income);
        System.out.println("Total tax : " + ReturnTaxRunner);

    }
}
