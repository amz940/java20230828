package ch12api.lecture;

public class C12string {
    public static void main(String[] args) {
        // length : 길이
        String a = "java";
        String b = "spring";
        String c = "hello world";
        String d = "hi java  ";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length()); // " " 뛰우기도 length에 포함된다

        // text block  """ ~ """ 따옴표 3개
        // 여러개의 문자열을 쓸 때 유용
        // 가장 왼쪽 들여쓰기 기준으로 길이를 계산
        String e = """
                    hello world
                    hi java
                    greeting spring
                    """;
        System.out.println(e.length());


    }
}
