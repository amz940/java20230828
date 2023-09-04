package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);

        // 메소드 참조 (method reference)
        MyInterface06 o2 = x -> someMethod(x);
        MyInterface06 o3 = C06methodReference::someMethod;
    }

    public static void someMethod( int x ){

    }
}

interface MyInterface06{
    void method( int a );
}