package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        // String : 문자열
        String a = "java";
        String b = "java";
        String c = new String("java");
            // b 랑  c는 구조적으로도 똑같다 new String이 생략됬을뿐

        System.out.println( a == b);    // true
        System.out.println(a.hashCode());
        System.out.println( a == c);    // false

        System.out.println( a.equals(b)); // true
        System.out.println( a.equals(c)); // true

    }
}
