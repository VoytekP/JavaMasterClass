package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    getDurationString(65,45);
    getDurationString(3945);

}

    public static int getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
            return -1;
        }

        int hours = minutes / 60;
        int secondsRemaining = seconds % 60;
        int hoursRemaining = minutes % 60;

        System.out.println(hours + " h " + hoursRemaining + " m " + secondsRemaining + " s");
        return 1;
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return -1;
        }

        int minutes = seconds / 60;
        int minutesRemainder = (int) seconds % 60;
        System.out.println(minutes + " m " + minutesRemainder + " s");
        return 1;
    }
}
