package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        //regex = regural expression의 줄임말 , 정규 표현식
        //문자열의 패턴을 나타내는 기호들

        //문자
        "x".matches("x");
        System.out.println("x".matches("x")); // true
        System.out.println("a".matches("a")); // true
        System.out.println("x".matches("a")); // false

        //문자들
        System.out.println("xyz".matches("xyz")); // true
        System.out.println("xyz".matches("xxx")); // false
        System.out.println("xyz".matches("x")); // false

        //수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); // true
            // {n} -> 바로 앞 문자!!가 n번 반복한다
        System.out.println("aaa".matches("a{3}")); // true
        System.out.println("aa".matches("a{3}")); // false
        System.out.println("aaa".matches("a{1,3}")); // true
            // {n,x} -> n번부터 ~ x번까지 안에서 반복해서 나오면 true 다

        System.out.println("dog".matches("do{1,3}g")); // true
        System.out.println("dooog".matches("do{1,3}g")); // true

        // 그룹화 ( )
        System.out.println("dodog".matches("(do){1,3}g")); // true
            // 문자 말고 문자열을 수량자 할 때 쓰인다
        System.out.println("dog".matches("(do){1,3}g")); // true

        // 수량
        System.out.println("dog".matches("do{1,}g"));
            // {n , } n번 이상이면 다 트루 , 몇번을 반복하든
        System.out.println("doooooooooog".matches("do{1,}g"));
        System.out.println("dooooooooog".matches("do{1,}g"));

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g")); // true
        System.out.println("dog".matches("do?g")); // true
        System.out.println("doog".matches("do?g")); // false

        // * : 0 번 이상
        System.out.println("dg".matches("do*g")); // true
        System.out.println("dooog".matches("do*g")); // true
        System.out.println("doooooooooog".matches("do*g")); // true

        // + : 1 번 이상
        System.out.println("dog".matches("do+g")); // ture
        System.out.println("dooooog".matches("do+g")); // true
        System.out.println("dg".matches("do+g")); // false


    }
}
