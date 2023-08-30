package ch08extends.book.sec07.exam4;

public class Car {
    //필드 변수 선언
    Tire tire;  //  나중에 Tire 에  인스턴스값을 넣기 쉽게 정의만 해놓은것
                // 즉 포장해놓았다. wrapper 클래스다
    //메소드 선언
    void run(){
        //tire 필드에 대입된 객체의 roll()메소드 호출
        tire.roll();
    }

}