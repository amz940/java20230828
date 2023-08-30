package ch08extends.book.sec07.exam13;

public class Car {
    int speed;

    void speedUp(){
        speed += 1;
    }
    //final 메소드
    final void stop(){
        System.out.println("차를 멈춘다");
        speed = 0;
    }

}

class SportCar extends Car{
    void speedUp(){
        speed += 10;
    }
//    void stop(){  // final 메소드라 재정의 할 수 없다.
//        System.out.println("차를 멈춤");
//    }
}
