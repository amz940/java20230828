package ch07extends.book.sec07.exam02;

public class Parents {
    void method1(){
        System.out.println("부모의 메소드");
    }

    void method2(){
        System.out.println("부모의 메소드2");
    }
}

class Child extends Parents{

    void method2(){
        super.method1();
        System.out.println("자식의 메소드2");
    }
    void method3(){
        System.out.println("자식의 메소드3");
    }
}
