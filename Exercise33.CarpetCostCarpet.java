package academy.learnprogramming;

public class Carpet {

    private double cost;

    // Constructor

    public Carpet(double cost) {
        this.cost = cost;

        if (cost < 0) {
            this.cost = 0;
        }
    }

    // Method

    public double getCost() {
        return cost;
    }
}
