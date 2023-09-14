package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try{
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch ( Exception e) {
            System.out.println("code3");
        } finally {
            // finally block :
            // exception이 있든 없든 상관없이
            // 무조건 실행되는 block
            System.out.println("무조건 실행되는 코드");
        }

        System.out.println("code4");
    }
}
