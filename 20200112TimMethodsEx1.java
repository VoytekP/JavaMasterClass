public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
