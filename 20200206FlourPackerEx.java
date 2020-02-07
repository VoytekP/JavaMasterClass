package academy.learnprogramming;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) { // (2, 1, 5)
        if (bigCount < 0 || smallCount < 0 || goal < 0) { // non of the eateries can be negative
            return false;
        }
        bigCount = bigCount * 5; // all big bags are equal 5 kg
        int sum = bigCount + smallCount; // the sum of both 5 kg & 1 kg bags
        if (sum < goal) { // if sum is less then goal its always false
            return false;
        }
        if (bigCount > goal) { // If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
            return (((goal / 5) * 5) + smallCount) >= goal; // this equation was the hardest part of the problem
        }
        return true;
    }
}
