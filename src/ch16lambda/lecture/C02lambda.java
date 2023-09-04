package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        MyInterface02 o1 = new MyInterface02() {
            @Override
            public void method() {
                System.out.println("C02lambda.method");
            }
        };
        o1.method();
        // lambda
        // 타입 객체이름 = (파라미터 목록) -> { 메소드 몸통 }
        MyInterface02 o2 = ( ) -> {
            System.out.println("C02lambda.main");
        };
        // 메소드 몸통의 코드가 한 줄이면 중괄호도 생략 가능
        o2.method();
        MyInterface02 o3 = ( ) -> System.out.println("C02lambda.main");
    }
}

@FunctionalInterface
interface MyInterface02{
    // 파라미터 없는 메소드
    // 리턴 없음
    void method();
}
