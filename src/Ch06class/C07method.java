package Ch06class;

public class C07method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        MyClass07 o2 = new MyClass07();

        o1.myMethod();
        o2.myMethod();
        // 줄맞춤 crtl + alt + l
        o1.name = "java";
        o2.name = "spring";

        o1.printName();
        o2.printName();
    }
}

class MyClass07 {
     String name;

    void printName() {
        System.out.println("name = " + name);
    }

    void myMethod() {
        System.out.println("myMetod 실행됨");
        System.out.println("MyClass07");

    }


}
