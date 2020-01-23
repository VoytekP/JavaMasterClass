package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long days = hour / 24;
            long years = days / 365;
            long yearsRemainder = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + yearsRemainder + " d");
        }
    }
}
