package ch07extends.book.sec07.exam11;

public abstract class Animal {
    //메소드 선언
    void breath(){
        System.out.println("숨을 쉽니다");
    }
    // 추상 메소드 선언
    abstract void sound();
}

class Dog extends Animal{
    //추상 메소드 재정의
    void sound(){
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    //추상 메소드 재정의
    @Override
    void sound() {
        System.out.println("야옹");
    }
}