package ch08interface.lecture;

public class C03interface {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.method1();
        o1.method2();
        o1.method3();

        MyInterface031 i1 = o1;
        MyInterface032 i2 = o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        i1.method1();
//        i1.method3();

        i2.method3();
//        i2.method1();
    }
}

interface MyInterface031 {
    void method1();
    void method2();
}
interface MyInterface032{
    void method3();
    void method4();
    void method5();
}
// 여러 인터페이스를 구현 할 수 있다
// 구현한 인터페이스에 들어있는 메소드 전부를 다 오버라이딩 해야 한다.
class MyClass03 implements MyInterface031, MyInterface032 {

    @Override
    public void method1() {
        System.out.println("MyClass03.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass03.method2");
    }

    @Override
    public void method3() {
        System.out.println("MyClass03.method3");
    }

    @Override
    public void method4() {
        System.out.println("MyClass03.method4");
    }

    @Override
    public void method5() {
        System.out.println("MyClass03.method5");
    }
}