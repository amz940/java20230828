package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 시작하는 위치( index ) 리턴
        // 값이 존재 하지 않을 때  -1 을 리턴한다
        String a = "spring";

        int index = a.indexOf("ring"); // 2번 부터 시작
        System.out.println(index);

        System.out.println(a.indexOf("pr")); // 2

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));  // 2

        int index1 = b.indexOf("ring", 2); // 2
        System.out.println(index1);

        System.out.println(b.indexOf("ring",3)); // 12
    }
}
