package ch11exception.book.sec5;

public class ThrowsExample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        findClass();
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
