package ch12api.lecture;

public class C01object {
    public static void main(String[] args) {
        // Object
        // 모든 클래스의 상위 클래스
        // 모든 타입의 상위 타입
        String s = "java";
        Object o1 = s;
        o1.toString();

        Integer a = 4;
        System.out.println(System.identityHashCode(a));

        C01object c = new C01object();
        Object o3 = c;


        int j = 30;
        Object o4 = j;
    }
}
