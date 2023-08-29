package ch05refrerence.exam;

public class Refenence {
    public static void main(String[] args) {
        Data a = new Data();
        Data2 d = new Data2();
        a.x = 10;
        d.x = 10;
        //기본형
        System.out.println("main() x의 값 : " + a.x);
        System.out.println("main()의 주소값 : "+ System.identityHashCode(a));

        primitiveType(a.x);

        System.out.println("After primitiveType(a.x)");
        System.out.println("main() x의 값 : " + a.x);
        System.out.println("main()의 주소값 : "+ System.identityHashCode(a));
        //참조형
        System.out.println("--------------------------------");
        System.out.println("main() x의 값 : " + d.x);
        System.out.println("main()의 주소값 : "+ System.identityHashCode(d));

        refernceType(d);

        System.out.println("After change(d)");
        System.out.println("change(d)의 주소값 : "+ System.identityHashCode(d));
        System.out.println("main() : x = " + d.x);
    }
    //기본형 타입
    static void primitiveType(int x ){
        x = 1000;
        System.out.println("primitiveType d.x = " + x);
        // int는 기본형이라 주소값이 없어서 변하지 않는다.
        // 즉 주소값 코드를 찍어도 오류가 난다.
//        System.out.println("main()의 주소값 : "+ System.identityHashCode(a));
    }

    //참조(Reference) 타입
    static void refernceType(Data2 d){
        d.x = 1000;
        System.out.println("RefernceType d.x = " + d.x);
        System.out.println("change(d)의 주소값 : "+ System.identityHashCode(d));
    }
}

class Data{
    int x;
}
class Data2{
    int x;
}