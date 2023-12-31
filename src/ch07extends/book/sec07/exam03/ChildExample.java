package ch07extends.book.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입 변환
        Parent parent = new Child();
        // parent 타입으로 필드와 메소드 생성
        parent.field1 = "data1";

        parent.method1();
        parent.method2();
//        parent.method3();

        // 강제 형변환
        Child child = (Child) parent;
        //Child 타입으로 필드와 메소드 사용
        child.field2 = "data2";
        child.method3();

    }
}
