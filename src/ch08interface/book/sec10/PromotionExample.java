package ch08interface.book.sec10;

interface A { }
class B implements A{}
class C implements A{}
class D extends B {}
class E extends C{}

public class PromotionExample{
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = b;
        a = c;
        a = d;
        a = e;
    }
}


