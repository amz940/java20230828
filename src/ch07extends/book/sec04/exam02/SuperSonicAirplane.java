package ch07extends.book.sec04.exam02;

public class SuperSonicAirplane extends Airplane {
    static int normal = 1;
    static int supersonic = 2;

    int flymode = normal;

    void fly(){
        if(flymode == supersonic){
            System.out.println("초음속 비행합니다");
        } else{
            // Airplane의 fly() 메소드 호출
            super.fly();

        }
    }

}
