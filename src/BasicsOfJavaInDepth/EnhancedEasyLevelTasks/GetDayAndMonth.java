package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;


public class GetDayAndMonth {

    public static String getDayString(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
    }


    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, UNKNOWN
    }

    public static Days getDayEnum(int day) {
        return switch (day) {
            case 1 -> Days.MONDAY;
            case 2 -> Days.TUESDAY;
            case 3 -> Days.WEDNESDAY;
            case 4 -> Days.THURSDAY;
            case 5 -> Days.FRIDAY;
            case 6 -> Days.SATURDAY;
            case 7 -> Days.SUNDAY;
            default -> Days.UNKNOWN;
        };
    }


    public enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static int getMonthNumber(Months month) {
        return switch (month) {
            case JANUARY -> 1;
            case FEBRUARY -> 2;
            case MARCH -> 3;
            case APRIL -> 4;
            case MAY -> 5;
            case JUNE -> 6;
            case JULY -> 7;
            case AUGUST -> 8;
            case SEPTEMBER -> 9;
            case OCTOBER -> 10;
            case NOVEMBER -> 11;
            case DECEMBER -> 12;
        };
    }


    public static void main(String[] args) {

        System.out.println("\n--- After inputting an int number, return a string as the name of the day:");
        System.out.println(getDayString(2));
        System.out.println(getDayString(5));
        System.out.println(getDayString(7));
        System.out.println(getDayString(0));
        System.out.println(getDayString(9));

        System.out.println("\n--- After inputting an int number, return an enum as the name of the day:");
        System.out.println(getDayEnum(1));
        System.out.println(getDayEnum(3));
        System.out.println(getDayEnum(6));
        System.out.println(getDayEnum(0));
        System.out.println(getDayEnum(8));

        System.out.println("\n--- After inputting the name of the month as an enum, " +
                "\nreturn the corresponding int number of the month:");
        System.out.println(getMonthNumber(Months.APRIL));
        System.out.println(getMonthNumber(Months.JULY));
        System.out.println(getMonthNumber(Months.DECEMBER));
    }
}
