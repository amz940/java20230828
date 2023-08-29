package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();

        System.out.println("o1의 참조값 : "+ System.identityHashCode(o1));

        o1.age = 30;
//        o1.model = "java";  // instance 필드랑 헷갈릴 수 있어서 권장 하지 않는다.
        MyClass05.model = "spring"; // static 필드는 클래스명이랑 나오는게 권장된다

        System.out.println("o1 = " + o1.age);
        System.out.println("o1 = " + o1.model);
        System.out.println("o2.age = " + o2.age);
        System.out.println("o2 = " + o2.model);
    }
}
class MyClass05{
    //속성 field
    // instance field
    int age;

    // static field = class field, 정적필드
    static String model;
    //기능 method


}