public class ReturnTax {
    public static double calculator(int c, int Income) {
        double tax;
        if (c == 1) {
            if (Income >= 0 && Income <= 8000)
                tax = Income * 0.10;
            else if (Income > 8000 && Income <= 32000)
                tax = 800 + (Income - 8000) * 0.15;
            else
                tax = 4400 + (Income - 16000) * 0.25;
        } else {
            if (Income >= 0 && Income <= 16000)
                tax = Income * 0.10;
            else if (Income > 16000 && Income <= 64000)
                tax = 1600 + (Income - 16000) * 0.15;
            else
                tax = 8800 + (Income - 64000) * 0.25;
        }
        return tax;

    }
}
