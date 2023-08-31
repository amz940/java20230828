package ch07extends.book.sec07.exam6;

public class Aexam {
    void method1(){
        System.out.println("A-method1()");
    }
}

class B extends Aexam{
    void method1(){
        System.out.println("B-method1()");
    }
}
class C extends Aexam{
    void method1(){
        System.out.println("C-method1()");
    }
    void method2(){
        System.out.println("C-method2()");
    }
}
