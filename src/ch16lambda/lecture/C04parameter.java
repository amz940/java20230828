package ch16lambda.lecture;


import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        Myinterface04 o1 = ( int x ) -> {};
        Myinterface04 o2 = ( x ) -> {};
        Myinterface04 o3 = x -> {}; // 파라미터가 하나면 {} 생략 가능

        List<String> list = List.of("java", "spring", "css", "html");
        list.forEach(e -> System.out.println(e));   // 배열을 람다식으로 표현
    }
}

interface Myinterface04{
    void method( int x );
}