package ch11exception.book.sec2.exam1;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자수 = " + result);
        } catch ( Exception e ){
            // 예외 정보를 얻는 3가지 방법
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행코드");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("ThisIsJava");
        printLength(null); // exception 발생시켜  catch문을 끌고올려고
        System.out.println("종료");
    }
}
