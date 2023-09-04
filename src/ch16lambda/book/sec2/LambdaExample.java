package ch16lambda.book.sec2;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action( () -> {
            System.out.println("출근을 합니다");
            System.out.println("프로그래밍을 합니다");
        });
        // 중괄호 생략
        person.action( ( ) -> System.out.println("퇴근합니다") );
    }
}
