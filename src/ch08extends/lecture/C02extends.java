package ch08extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubCLass021 o1 = new MySubCLass021();
        o1.name = "spring";
        o1.method3();

        MyClass02 o2 = new MyClass02();
        o2.name = "winter";
        o2.method3();
    }
}
// 위 코드의 문법 오류가 없도록 MyClass02를 작성
class MyClass02 {
    String name ;
    void method3() {
        System.out.println(name);
    }
}
class MySubCLass021 extends MyClass02 {

}
// MyClass02 : 상위 클래스, 부모 클래스, Super 클래스
// MySubClass021 : 하위 클래스 , 자식 클래스 , Sub 클래스