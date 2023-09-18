package ch18IO.lecture;

public class C26printf {
    public static void main(String[] args) {
        // %s : 문자열 출력
        System.out.printf("문자열 : %s%n", "java");
        System.out.printf("문자열1: %s%n문자열2: %s", "css","react");

        // %d : 정수(십진법) 출력
        System.out.printf("%n정수:%d", 99);
        System.out.printf("%n정수1:%d%n정수2:%d", 100, 200);
//        System.out.printf("정수3:%d%n","java"); // %타입이 맞지 않으면 익셉션 발생

        // argument_index$
        // 몇번째 인수를 불러올지 정해주는것
        // %n$d , %n$s ...
        System.out.printf("%n정수2:%2$d%n정수1:%1$d%n", 100, 200);
        System.out.printf("정수:%1$d%n",9,8);
        System.out.printf("정수:%2$d%n",9,8);
    }
}
