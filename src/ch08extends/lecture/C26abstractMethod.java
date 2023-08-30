package ch08extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();

        Animal26 a2 = new Fish26();
        a2.breath();
    }
}

//추상 메소드를 가진 클래스는 꼭 추상 클래스가 되어야 한다.
abstract class Animal26{
    //추상 메소드 : 몸통이 없는 메소드?

    abstract  void breath();
}

class Dog26 extends Animal26{
    //추상 메소드를 꼭 재정의(오버라이딩) 해야 한다.

    void breath(){
        System.out.println("폐로 숨을 쉽니다");
    }
}
class Fish26 extends Animal26{
    void breath(){
        System.out.println("아가미로 숨을 쉽니다.");
    }
}