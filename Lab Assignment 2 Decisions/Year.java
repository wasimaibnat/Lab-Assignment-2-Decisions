public class Year {

    private int year;

    public Year(int y) {
        year = y;
    }

    public boolean isLeapYear() {

        return (((year % 4 == 0) && (year % 100 != 0)) ||

                (year % 400 == 0));

    }

}
