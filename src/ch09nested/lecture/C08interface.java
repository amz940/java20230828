package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface{
            public void method2(){
                System.out.println("ConcreteClass.method2");
            }
        }
    }
}
class MyClass081 implements MyClass08.NestedInterface{  // 따른 클래스안에 있는 인터페이스도 사용가능
    public void method2(){
        System.out.println("MyClass081.method2");
    }
}
class MyClass08{
    interface NestedInterface{
        // pulbic final static field
        // public abstract instance method(**********), 추상 인스턴스메소드
        void method2();
        // private instance method
        // default instance method
        // public static method
        // private static method
    }

    void method(){
        class ConcreteClass implements NestedInterface{
            public void method2(){
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();

    }
}