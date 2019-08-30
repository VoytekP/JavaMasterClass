package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Flour pack = " + canPack(1,0,4));
        System.out.println("Flour pack = " + canPack(1,0,5));
        System.out.println("Flour pack = " + canPack(0,5,4));
        System.out.println("Flour pack = " + canPack(2,2,11));
        System.out.println("Flour pack = " + canPack(-3,2,12));
        System.out.println("Flour pack = " + canPack(3,2,-12));

        // write your code here
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return (goal <= bigCount * 5 + smallCount && goal % 5 <= smallCount);
    }

}
