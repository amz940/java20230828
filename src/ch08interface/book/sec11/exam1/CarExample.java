package ch08interface.book.sec11.exam1;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new HankookTire();

        myCar.run();
    }
}
