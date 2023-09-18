package ch18IO.lecture;

public class C27printf {
    public static void main(String[] args) {
        // width : 몇 글자로 출력할지 정한다(차지할 영역)
        // %n$ x : x만큼 공간 차지
        System.out.printf("@%1$6s@%n","java"); //@  java@ : 6개를 차지할꺼라서 빈공간 2개가 나온다
//        System.out.printf("@%12s@");

        // flag : 출력방법
        // - : 왼쪽정렬
        // %n$ - x : x만큼 공간 차지 하는데 왼쪽으로 정렬
        System.out.printf("@%1$6s@%n", "java");
        System.out.printf("@%1$-6s@%n", "java");

        // precision :
        // 실수(f)와 같이 쓰면 소숫점 이하 출력 갯수 정한다
        System.out.printf("%1$f%n", 3.141592);
        System.out.printf("%1$.3f%n", 3.141592);
        System.out.printf("%1$.1f%n", Math.PI);
        System.out.printf("%1$.0f%n", Math.PI);
    }
}
