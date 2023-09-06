package ch12api.book.sec6;

public class BoxingUnboxing {
    public static void main(String[] args) {
        // boxing
        Integer obj = 100;
        System.out.println("value = " + obj.intValue());
        // unboxing
        int value = obj;
        System.out.println("value = " + value);

        int result = obj + 100;
        System.out.println("result = " + result);
    }
}
