package ch07extends.lecture;

public class C25abstract {
    public static void main(String[] args) {
        Dog25 d1 = new Dog25();
        Cat25 c1 = new Cat25();

        Animal25 a1 = d1;
        Animal25 a2 = c1;

//        Animal25 a3 = new Animal25();

    }
}
// 추상클래스(abstract class)로 인스턴스 생성 불가
abstract class Animal25{
    String name;//필드
    Animal25(){};//생성자
    void run(){};//메소드
    //는 생성 가능 하지만 객체만 생성 불가
}

class Dog25 extends Animal25{

}
class Cat25 extends Animal25{

}