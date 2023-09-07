package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
//        MyClass02<int> o5 = new MyClass02<int>(); // 참조타입만 올수 있다

        // 뒤에는 생략 가능
        MyClass02<Object> o6 = new MyClass02<>();
        MyClass02<String> o7 = new MyClass02<>();
        MyClass02<Integer> o8 = new MyClass02<>();
        MyClass02<Boolean> o9 = new MyClass02<>();
    }
}

// generic type
// <T> : type parameter
// 그럼 제네릭 타입은 퍼블릭 이랑 abstract를 들고 있는건가?
// 완전히 다르다
// 추상 클래스는 상속 이나 인터페이스를 할때 쓰이는거고
// 제네릭은 필드 타입을 나중에 변경 하고 싶을 때 쓰이는거다
// 거의 사용 하지 않고 자바 API를 볼때 쓰여서 참고하라고 알려주는것
class MyClass02<T>{
    private T a;
}
