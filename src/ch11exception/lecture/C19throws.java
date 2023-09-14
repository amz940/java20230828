package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    public static void method1() throws ClassNotFoundException {
        System.out.println("code 1");
        method2();
//        try {
//            method2(); // code2를 실행하고 싶으면 try-catch
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        // code2를 실행하지 않고 싶으면 throws
        System.out.println("code 2");
    }
    public static void method2() throws ClassNotFoundException{

    }
    public static void method3() throws ClassNotFoundException{

    }
}
