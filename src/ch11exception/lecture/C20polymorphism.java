package ch11exception.lecture;

public class C20polymorphism {
    public static void main(String[] args) throws Exception {
        // exception : 맨 마지막 실행 메소드엔 exception 가능
        method1();
//        try {
//            method1();
//        } catch (ReflectiveOperationException e) {
//            throw new RuntimeException(e);
//        }
    }
    public static void method1() throws ReflectiveOperationException{
        method2();
    }
    public  static void method2() throws ClassNotFoundException{

    }

}
