package ch11exception.lecture;

public class C08finally {
    public static void main(String[] args) {
        // try-catch-finally 에서
        // catch 가 없어도 코드는 잘 작동한다
        try {
            System.out.println("코드 실행");
            return;
        } finally {
            System.out.println("무조건 실행되는 코드");
        }
    }
}
