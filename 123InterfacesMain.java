package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone gregsPhone;
        gregsPhone = new DeskPhone(123456);
        gregsPhone.powerOn();
        gregsPhone.callPhone(123456);
        gregsPhone.answer();

        gregsPhone = new MobilePhone(23565);
        gregsPhone.powerOn();
        gregsPhone.callPhone(2456);
        gregsPhone.answer();

    }
}
