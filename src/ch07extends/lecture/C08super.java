package ch07extends.lecture;

public class C08super {
    public static void main(String[] args) {
        //출력 결과
        // "자식의 메소드!" 와 "부모의 메소드!"가 출력
        MySubClass081 o1 = new MySubClass081();
        o1.method1();
    }
}

class MyClass08{
    void method1(){
        System.out.println("부모의 메소드!");
    }
}
class MySubClass081 extends MyClass08{
    void method1(){
        System.out.println("자식의 메소드!");
        super.method1();
        // super : 부모의 멤버(field와 method)에 접근할 때 사용하는 키워드
    }
}