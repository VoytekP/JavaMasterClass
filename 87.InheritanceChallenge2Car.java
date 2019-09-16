package academy.learnprogramming;

public class Car extends Vehicle {

    private int passengers;
    private int powerSteering;
    private int powerWindows;

    public Car(int steering, String fuel, int passenger, int powerSteering, int powerWindows){
        super(steering, 4, fuel);
        this.passengers = passenger;
        this.powerSteering = powerSteering;
        this.powerWindows = powerWindows;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getPowerSteering() {
        return powerSteering;
    }

    public int getPowerWindows() {
        return powerWindows;
    }

    public void moving(int speed) {
        System.out.println("Car Moving at a speed of " + speed);
    }

    public void gearUpShift(int speed) {
        System.out.println("Method gearUpShift called ");
        moving(speed);
    }

    public void gearDownSift(int speed) {
        System.out.println("Method gearDownShift called");
        super.moving(speed);
    }

    public void diesel() {
        System.out.println("Diesel Method Called");
    }

    public void petrol() {

    }
}
