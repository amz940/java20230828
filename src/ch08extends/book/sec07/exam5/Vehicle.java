package ch08extends.book.sec07.exam5;

public class Vehicle {

    void run(){
        System.out.println("차량이 달립니다");
    }
}

class Bus extends Vehicle{
    void run(){
        System.out.println("버스가 달립니다");
    }
}
class Taxi extends Vehicle{
    void run(){
        System.out.println("택시가 달립니다");
    }
}