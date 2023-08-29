package Ch06class;

public class C08static {
    public static void main(String[] args) {
        // static 멤버를 사용할땐 생성자가 필요없다
//        MyClass08 o1 = new MyClass08();
//        o1.name = "java";
//        o1.printName();

        // static member는 클래스 이름으로 바로 접근하는걸 추천
        MyClass08.name = "spring";
        MyClass08.printName();
    }
}

class MyClass08 {
    static String name;

    static void printName() {
        System.out.println("name = " + name);
    }
}