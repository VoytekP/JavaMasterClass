public class Main {

    public static void main(String[] args) {
        char switchValue = 'E';

        switch (switchValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Value was A, B, C, D or E");
                break;
        }

        System.out.println("**********");

        String month = "june";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }
}
