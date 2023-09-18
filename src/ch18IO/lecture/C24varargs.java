package ch18IO.lecture;

public class C24varargs {
    public static void main(String[] args) {

        // varargs(가변 인자) : ...

        // 가변인자가 없던 시절 : 메소드를 계속 오버로딩해서 작성
        method1(3);
        method1(5,6);
        method1(new int[]{10,20,30});

        // 가변인자 이후
        // ... 하나로 오버로딩을 해결 -> 코드 단순화
        method2(2);
        method2(5,6);
        method2(10,20,30);
    }
    public  static void method2(int... nums){
        // 가변 인자 사용방법
        // 배열로 사용하면 된다

        for(int i = 0; i<nums.length; i++){
            System.out.println("nums[i] = " + nums[i]);
        }
    }
    public static void method3(String s, int... args /*,String b*/){
        // 가변 인자 사용시 주의 점
        // 매개변수 목록 마지막에만 작성 가능하다
    }
    public static void method1(int a)  {

    }
    public static void method1(int a , int b){

    }
    public  static void method1(int[] arr){

    }
}
