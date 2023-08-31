package ch07extends.book.sec04.exam03;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snow = new SnowTire() ;
        Tire tire = snow;   // 타입과는 관계없이 실제 인스턴스값이 실행

        snow.run();
        tire.run();
    }
}
