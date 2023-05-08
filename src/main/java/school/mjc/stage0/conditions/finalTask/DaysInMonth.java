package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        amountOfDays(month, year);
    }

    public boolean isLeapYear(int year) {
        return  !((year % 100 == 0) && (year % 400 != 0)) && (year % 4 == 0);
    }

    public void amountOfDays(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> {
                if(year > 0) {
                    boolean leap = isLeapYear(year);
                    if (leap)
                        System.out.println(29);
                    else
                        System.out.println(28);
                }
                else
                    System.out.println("invalid date");
            }
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }
    }
}
