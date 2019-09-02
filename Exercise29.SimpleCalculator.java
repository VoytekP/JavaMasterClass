package academy.learnprogramming;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber () {
        return this.firstNumber;
    }

    public double getSecondNumber () {
        return this.secondNumber;
    }

    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0.0;
        } else {
            return getFirstNumber() / getSecondNumber();
        }
    }
}
