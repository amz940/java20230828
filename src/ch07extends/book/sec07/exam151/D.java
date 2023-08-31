package ch07extends.book.sec07.exam151;

import ch07extends.book.sec07.exam15.A;

public class D extends A {

    public D(){     // D의 기본 생성자
        super();    // A(){}를 호출
    }

    public void method(){   //상속을 통해 사용 가능
        this.field = "value";
        this.method();
    }

    public void method2(){  //직접 객체를 생성해서 사용하는것은 안된다
//        A a = new A();
//        a.field = "value";
//        a.method();
    }

}
