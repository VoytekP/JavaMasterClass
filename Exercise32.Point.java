package academy.learnprogramming;

public class Point {

    private int x;
    private int y;

    // Constructors

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // methods

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2));
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());

    }

}
