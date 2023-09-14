package ch11exception.book.sec5;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            findClass();
        } catch ( ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String");
        System.out.println("클래스");
    }
}
