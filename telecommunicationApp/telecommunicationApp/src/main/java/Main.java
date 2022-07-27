public class Main {
    public static void main(String[] args) {
//        DeskPhone myDeskPhone = new DeskPhone("123456");
//        myDeskPhone.powerOn();
//        myDeskPhone.callPhone("123456");
//        myDeskPhone.callPhone("789123");
//        myDeskPhone.answer();

        MobilePhone myPhone = new MobilePhone("123456");
        myPhone.powerOn();
        myPhone.callPhone("123456");
//      myPhone.callPhone("789123");
        myPhone.answer();
    }
}
