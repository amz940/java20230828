package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
        // runtimeException :
        // 바로 써도 된다
        System.out.println("main code1");
        try{
            method1();
        } catch (RuntimeException e){
            System.out.println("예외발생");
        }

        System.out.println("main code2");

    }

    public static void method1(){
        System.out.println("code1");
        throw new RuntimeException();
//        System.out.println("code2"); // code1만 던지고 코드 종료
    }
}
