package academy.learnprogramming;

public class Floor {

    private double width;
    private double length;

    // constructor

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
        if (width >= 0 && length >= 0) {
            this.width = width;
            this.length = length;
        }
    }

    // Method

    public double getArea() {
        return this.width * this.length;
    }


}
