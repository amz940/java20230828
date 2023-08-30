package ch08extends.lecture;

public class C24constructor {
}
//기본 생성자가 자동으로 생겨서 생기는 문제점
class MyClass24{
    int age;
    //파라미터(매개변수) 있는 생성자 작성하면
    //파라미터 없는 생성자( 기본 생성자 , 0-args-constructor)가
    //자동으로 삽입되지 않는다.
    MyClass24(int age, String java){
        this.age = age;
    }
}

class MySubClass241 extends MyClass24{
    MySubClass241(){
        super(40, "자바");
    }

    // 명시적으로 상위 클래스의 생성자 호출 코드 작성
}