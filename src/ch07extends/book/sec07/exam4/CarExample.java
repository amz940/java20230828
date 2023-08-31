package ch07extends.book.sec07.exam4;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.tire = new Tire();
        myCar.run();

        myCar.tire =  new HanKookTire();
        myCar.run();

        myCar.tire = new KumHoTire();
        myCar.run();
    }
}
