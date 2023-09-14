package ch11exception.lecture;

public class C07finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int j =  3 / 0;
            System.out.println("code2");
            return; // void와 return은 같이 못 쓰는줄 알았으니 리턴값만 안주면 된다.
                    // 코드 실행 끝을 의미한다
        } catch (Exception e) {
            System.out.println("code3");
        } finally { // 코드가 끝나도 무조건 실행되는 코드!!
            System.out.println("code4");
        }
        System.out.println("code5");

    }
}
