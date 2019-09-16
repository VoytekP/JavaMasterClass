package academy.learnprogramming;

public class Vehicle {

    private int steering;
    private int tiers;
    private String fuel;

    public Vehicle(int steering, int tiers, String fuel) {
        this.steering = steering;
        this.tiers = tiers;
        this.fuel = fuel;
    }

    public int getSteering() {
        return steering;
    }

    public int getTiers() {
        return tiers;
    }

    public String getFuel() {
        return fuel;
    }

    public void moving(int speed){
        System.out.println("Vehicle moving at a speed of " + speed);
    }
}
