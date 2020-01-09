package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Min value = " + (myMinIntValue -1 )); // underflow

        int myMaxIntTest = 2_147_483_647; // but if you add this only by 1 digit you will get an error

        System.out.println("***************");

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        System.out.println("***************");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L;
        System.out.println("***************");

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_648L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println("***************");

        int myTotal = (myMinIntValue / 2); // the best is to use the int then to use byte or short

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("***************");

        byte myByteNumber = 123;
        short myShortNumber = 3245;
        int myIntNumber = 2;
        long myLongNumber = 50_000L + 10 * (myByteNumber + myShortNumber + myIntNumber);

        System.out.println(myLongNumber);

        short shortTotal = (short) (1000 + 10 *
                (myByteNumber + myShortNumber + myIntNumber));


    }
}
