package ch07extends.book.sec07.exam15;

public class B {
    public void method(){       // 같은 패키지 여서 가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}
