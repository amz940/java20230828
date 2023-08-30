package ch08extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        Animal15 ani1 = new Dog15();    // animal15라는 타입에 dog15의 인스턴스 변수값을 초기화 해서
        Animal15 ani2 = new Cat15();    // ani1이라는 이름을 붙여 객체 생성

        Dog15 d1 = (Dog15) ani1;
        Cat15 c1 = (Cat15) ani2;

//        Cat15 c2 = (Cat15) ani1; // 안된다, 문법 오류는 아니다, 그래서 더욱 조심
//        Dog15 d2 = (Dog15) ani2;    // 문법오류도 아니여서 프로그램이 따로 못잡아줌!

        Animal15 ani3 = new Animal15();
//        Dog15 d3 = (Dog15) ani3;    // x

        System.out.println("실행이 되는중");
    }


}

class Animal15{

}
class Dog15 extends Animal15{

}
class Cat15 extends Animal15{

}