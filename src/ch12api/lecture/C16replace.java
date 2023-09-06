package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        // replace : 특정 문자열 -> 다른 문자열로 변경
        // 원본이 바뀌는게 아니라서 새로 객체를 만들어 줘야한다
        String a = "spring";
        String b = a.replace("sp", "abc");
        System.out.println(b);

        String t = "java is java";
        String x = t.replace("java", "spring");
        System.out.println(x);

        String c = "JAVA is java";
        String c2 = c.replace("JAVA", "html");
        System.out.println(c2);
    }
}
