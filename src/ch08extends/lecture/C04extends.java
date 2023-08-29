package ch08extends.lecture;

public class C04extends {
    public static void main(String[] args) {
        MySubClass041 o1 = new MySubClass041();
        o1.method1();
        o1.method2();

        MySubClass042 o2 = new MySubClass042();
        o2.method1();
        o2.method03();
    }
}

class MyClass04 {
    void method1() {
        System.out.println("MyClass04.method1");
    }
}

class MySubClass041 extends MyClass04{
    private int age;
    void method2(){
        System.out.println("MySubClass041.method");
    }
}

class MySubClass042 extends MyClass04 {
    void method03(){
        System.out.println("MySubClass042.method03");
    }
}