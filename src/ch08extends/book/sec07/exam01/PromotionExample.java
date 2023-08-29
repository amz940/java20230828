package ch08extends.book.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        D d1 = a;
//        B b3 = e; // 상속 관계가 아니여서
//        C c2 = d;
    }
}

class A{

}
class B extends A{

}
class C extends A{

}
class D extends B{

}
class E extends C{

}