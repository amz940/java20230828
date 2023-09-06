package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
        // wrapper class : 기본(primitive) 타입 8개를 감싸고 있는 클래스

        //       기본타입 : byte, short, int ,long ,float, double, boolean, char
        // wrapper class : Byte, Short, Integer, Long, Float, Double, Boolean, Character

        // 기본 타입 -> 참조 타입으로 변환 : boxing
        // 참조 타입 -> 기본 타입으로 변환 : unboxing

        // boxing
        int i = 500;
        Integer j = new Integer(i); // boxing ,
        Integer k = Integer.valueOf(i); // boxing

        System.out.println(i);
        System.out.println(k);

        // unboxing
        Integer l = Integer.valueOf(1000); // boxing
        int m = l.intValue();   // unboxing

        System.out.println(l);
        System.out.println(m);

        // auto boxing
        int n = 777;
        Integer o = n; // auto boxing

        // auto unboxing
        Integer p = Integer.valueOf(8888);
        int q = p; // auto unboxing

    }
}
