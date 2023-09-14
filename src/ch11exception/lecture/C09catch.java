package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {
        // 어떤 코드들이 발생할만한 exception이 1개 이상일 때
        // catch 블럭을 여러개 만들면 해결된다
        try {
            int[] arr = {0,1,2};
            int i = 3/ arr[3];
            System.out.println("try내의 흐름");
        } catch (ArithmeticException e){
            System.out.println("잘못된 산술 연산!");
        } catch (IndexOutOfBoundsException e){
            System.out.println("잘못된 인덱스 연산");
        }


        System.out.println("실행");
    }
}
