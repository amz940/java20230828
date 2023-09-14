package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        // 일반 예외인 exception은 꼭 발생한다고 명시 해놔야 한다
        // exception인 꼭 try-catch로 작성해줘야 한다
        System.out.println("main code1");
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    private static void method3() throws Exception {
        throw new Exception();
    }

}
