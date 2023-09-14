package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {
        System.out.println("code 1");
        System.out.println("code 2");

        try {
            // try block
            // exception이 발생할 수 도 있는 코드
            // exception이 발생하더라도 코드 실행을 이어가기 위해 쓰인다
            int i = 0;
            int j = 3 / i; // ArithmeticException
            System.out.println("code3"); // exception 발생으로 인해 실행되지 못함
        } catch (ArithmeticException e) {
            // catch block
            // 발생한 exception 객체를 잡은 후 실행하는 코드
            // exception이 없으면 실행되지 않는다
            System.out.println("exception 발생 시 실행 하는 코드1");
            System.out.println("exception 발생 시 실행 하는 코드2");
        }

        System.out.println("code 4");
    }
}
