package ch08extends.book.sec07.exam02;

public class ParentsExample {
    public static void main(String[] args) {
        Child child = new Child();

        child.method1();
        child.method2();    // super 메소드도 포함
        child.method3();

        Parents parents = child;

        parents.method1();
        System.out.println("----------");
        parents.method2();
        System.out.println("----------");
//        parents.method3();
        child.method3();
    }
}
