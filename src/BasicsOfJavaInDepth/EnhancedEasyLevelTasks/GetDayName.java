package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;


public class GetDayName {

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
    }
}
