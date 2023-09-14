package ch11exception.book.sec2.exam2;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            // lang 패키지 안에 있는 String 클래스를 뜻하는거
            System.out.println("java.lang.String 클래스가 있다");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            // String2 클래스는 없기 때문에 오류가 발생함
            System.out.println("java.lang.String2 클래스가 있다");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("진행 중");
    }
}
