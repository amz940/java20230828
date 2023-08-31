package ch07extends.book.sec04.exam02;

public class SuperSonicMain {
    public static void main(String[] args) {
        SuperSonicAirplane sonic = new SuperSonicAirplane();
        sonic.takeoff();
        sonic.fly();
        sonic.flymode = SuperSonicAirplane.supersonic;
        sonic.fly();
        sonic.flymode = SuperSonicAirplane.normal;
        sonic.fly();
        sonic.land();


    }
}
