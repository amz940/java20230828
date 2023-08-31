package ch08interface.book.sec10.exam2;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); // 인터페이스엔 없는 메소드라 호출이 안된다

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
