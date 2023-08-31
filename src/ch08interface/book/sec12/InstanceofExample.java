package ch08interface.book.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        //객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        //ride() 메소드 호출 시 객체 매개변수 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }
//    인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle vehicle){
//      매개값이 bus 인 경우 강제타입으로 변환해서 checkFare() 호출
//        if(vehicle instanceof Bus){
//            Bus bus = (Bus) vehicle;
//            bus.checkFare();
//        }
//        자바 12 버전부터 가능
        if(vehicle instanceof Bus bus){
            bus.checkFare();
        }

        vehicle.run();
    }
}
