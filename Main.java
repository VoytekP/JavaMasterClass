package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 5;
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("wasn't a 3 or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

//        char switchValue2 = 'A';
//        switch(switchValue2) {
//            case 'A':
//                System.out.println("Value was A");
//                break;
//            case 'B':
//                System.out.println("Value was B");
//                break;
//            case 'C': case 'D': case 'E':
//                System.out.println("Value was " + switchValue2);
//                break;
//
//            default:
//                System.out.println("Value not found");
//                break;
//
//        }

        String month = "JANUARY";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
