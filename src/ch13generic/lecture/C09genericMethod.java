package ch13generic.lecture;

public class C09genericMethod {
    public static void main(String[] args) {
        // 자동 완성 되는 애다
        // 이런게 있었구나 하고 넘기면 된다
        MyClass09 o1 = new MyClass09();
        o1.<Object>method(new Object());
        o1.<String>method("java");

        o1.method(new Object());
        o1.method("java");

        o1.<String>method1();
        o1.<Object>method1();

        String s = o1.<String>method1();
        Object o = o1.<Object>method1();

        String s1 = o1.method1();
        Object oo1 = o1.method1();
    }
}

class MyClass09{
    public <T> void method( T param){
        // method 앞에 붙는 제네릭을 제네릭메소드라 한다
    }
    // 리턴 타임 제네릭
    public <T> T method1(){
        return null;
    }

}