package ch18IO.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력할 문자들");
        System.out.printf("%s,%d,%f", "java", 3, 3.14);

        // 단축키 souf

        // %n  : new line
        System.out.printf("출력할 문자들3 %n다음줄 출력됨");
        System.out.printf("출력..%n 출력...");

        // %% : %  , 퍼센트를 출력하고 싶을때
        System.out.printf("%n%%:퍼센트");

    }
}
