package ch12api.book.sec6;

public class ValueCompare {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("== : " + (obj1 == obj2));
        System.out.println("equals() : " + obj1.equals(obj2));
        System.out.println(System.identityHashCode(obj1));
        System.out.println(System.identityHashCode(obj2));
        System.out.println();

        // 그냥 문자열 끼리 비교할땐 .equlas()를 쓰자 머리아프다
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("== : " + (obj3 == obj4));
        System.out.println("equals() : " + obj3.equals(obj4));
        System.out.println(System.identityHashCode(obj3));
        System.out.println(System.identityHashCode(obj4));
    }
}
