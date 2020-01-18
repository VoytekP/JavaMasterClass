package academy.learnprogramming;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        }
        if ((hourOfDay < 0 && hourOfDay > 23)) {
            return false;
        }
        else return barking == ((hourOfDay >= 0 && hourOfDay < 24) &&
                (hourOfDay < 8 || hourOfDay > 22));
    }
}
