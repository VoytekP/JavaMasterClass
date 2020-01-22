package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationsString(5,45));
        System.out.println(getDurationsString(3945));
        System.out.println(getDurationsString(-10));
    }

    private static String getDurationsString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + remainingMinutes;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString + "";
    }

    private static String getDurationsString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationsString(minutes , remainingSeconds);
    }


}
