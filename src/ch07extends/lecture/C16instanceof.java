package ch07extends.lecture;

public class C16instanceof {
    public static void main(String[] args) {
        Animal16 ani1 = new Dog16();
        Animal16 ani2 = new Cat16();
        Animal16 ani3 = new Animal16();

        //instanceof 연산자(+ , - ,* ,% ...)
        //연산 결과 : ture / false (boolean)
        //좌변 : 참조 변수 , 우변 : 타입
        // 형변환 가능한지 확인하는 코드

        System.out.println(ani1 instanceof Animal16);
        System.out.println(ani3 instanceof  Cat16);

        boolean result1 = ani1 instanceof Animal16;    // true
        boolean result2 = ani1 instanceof Dog16;    // true
        boolean result3 = ani1 instanceof Cat16;    // false

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        boolean result4 = ani2 instanceof Animal16; //true
        boolean result5 = ani2 instanceof Dog16;    //false
        boolean result6 = ani2 instanceof Cat16;    //true

        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

        boolean result7 = ani3 instanceof Animal16; //true
        boolean result8 = ani3 instanceof Dog16;    //false
        boolean result9 = ani3 instanceof Cat16;    //false

        System.out.println("result7 = " + result7);
        System.out.println("result8 = " + result8);
        System.out.println("result9 = " + result9);
    }
}

class Animal16{}
class Dog16 extends Animal16{}
class Cat16 extends Animal16{}