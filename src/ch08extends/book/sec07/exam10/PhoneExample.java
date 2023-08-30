package ch08extends.book.sec07.exam10;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone("owner"); // Phone 클래스에 abstract가 걸려 있어서

        SmartPhone smart = new SmartPhone("owenr");

        smart.turnOn();
        smart.internetSearch();
        smart.turnOff();

        Phone phone = smart;
        phone.turnOn();
        phone.turnOff();
//        phone.internetSearch();
    }
}
