package ch11exception.lecture;

public class C01exception {
    public static void main(String[] args) {
        System.out.println("실행코드1");
        System.out.println("실행코드2");

        int i = 0;
        int j = 3 /i ;  // ArithmeticException(산술적 오류) 발생

        System.out.println("실행코드3");


    }
}
