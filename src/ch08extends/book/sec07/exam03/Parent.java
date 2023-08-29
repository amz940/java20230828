package ch08extends.book.sec07.exam03;

import ch08extends.book.sec07.exam02.Parents;

public class Parent {
    // field 부분은 아직 안 배웠으므로 넘길껏
    String field1;

    void method1(){
        System.out.println("Parent-method1()");
    }
    void method2(){
        System.out.println("Parent-method2()");
    }
}

class Child extends Parent {
    String field2;
    void method3(){
        System.out.println("Child-method3()");
    }
}
