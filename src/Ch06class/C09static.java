package Ch06class;

public class C09static {
    public static void main(String[] args) {
        System.out.println("인스턴스멤버 출력");
        MyClass09 o1 = new MyClass09();
        o1.printName();

        System.out.println("static 클래스멤버 출력");
        MyClass09.printModel();
    }
}

class MyClass09 {
    String name; // instance field

    static  String model; // class field

    //instance method
    void printName() {
        // instance member 끼리 접근 가능
        System.out.println("인스턴스 name = " + name);

        //instance member에서 static member 접근 가능
        //static 클래스 멤버는 하나여서 접근 대상이 명확하여 가능
        System.out.println("클래스 model = " + model);
    }

    static void printModel() {
        //static member 끼리 접근 가능
        System.out.println("model = " + model);

        //static member에서 instance member 접근 불가능
        //instance member가 종류가 많기 때문에 어느 인스턴스에 접근해야 할지 명확하지 않아 불가능
//        System.out.println("name = " + name);
    }



}
