package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
        //substring : 부분 문자열 추출
        //첫 문자는 0으로 시작한다
        //마지막 숫자 -1까지의 문자를 추출

        String a = "spring";

        a.substring(0, 2);  // sp 만 추출
        System.out.println(a.substring(0,2)); // sp
        System.out.println(a.substring(3,6)); // ing

        System.out.println(a.substring(2));
        System.out.println(a.substring(0));
    }
}
