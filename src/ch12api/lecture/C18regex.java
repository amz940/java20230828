package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        //regex = regural expression의 줄임말 , 정규 표현식
        //문자열의 패턴을 나타내는 기호들
        // regex101.com  : 정규표현식을 검증 할때 사용하는 사이트

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

        // 문자 분류 (Character classes)
        System.out.println("dog".matches("d[oi]g")); // true
            //[n x] : n, x 문자 일때 true
        System.out.println("dig".matches("d[oi]g")); // ture
        System.out.println("dxg".matches("d[oi]g")); // false

        System.out.println("dog".matches("d[^oi]g")); // false
            //[^nx] : nx가 아닐 때 트루,  ^ = ! = not

        System.out.println("dog".matches("d[a-z]g"));
            //[a-z] : a부터 z까지 들어오면 true
        System.out.println("dxg".matches("d[a-z]g"));
        System.out.println("deg".matches("d[a-z]g"));

        System.out.println("dag".matches("d[a-cx-z]g"));
            //[a-cx-z] : a~c , x~z 까지의 문자만 true, 중간에 뛰어쓰면 안된다
        System.out.println("dyg".matches("d[a-cx-z]g"));
        System.out.println("dog".matches("d[a-cx-z]g"));
        System.out.println("deg".matches("d[a-cx-z]g"));

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("7".matches("\\d")); // true
            // \d = [0-9]
            // " " 안에 \을 사용 할려면 \\ 한번더 써야 한다

        System.out.println("a".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("\\w"));
            // \w = [a-z , A-Z , _ , 0-9] 까지 사용

        // 예제 : 숫자로 시작하면 안되고, 영문 대소문자 구별하고 , _ , $ 사용
//        String patten = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        String patten = "[a-zA-Z_$][\\w$]*";
        System.out.println("patten_1".matches(patten));
        System.out.println("$".matches(patten));
        System.out.println("0".matches(patten));

        // 전화번호 패턴
        // 010-9999-9999
        // 02-9999-9999
        // 0109999999
        // 021234546
        // 숫자 2~3로 시작

        String phone = "[\\d]{2,3}-?[\\d]{3,4}-?[\\d]{4}";
//        String phone = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-7472-0788".matches(phone));

        // 모든 문자 : . 으로 표시 가능
        System.out.println(" ".matches("."));
        System.out.println("3".matches("."));
        System.out.println("s".matches("."));
        System.out.println("_".matches("."));

        // . :  \.
        System.out.println(" ".matches("\\.")); // false
        System.out.println("3".matches("\\.")); // false
        System.out.println("s".matches("\\.")); // false
        System.out.println("_".matches("\\.")); // false
        System.out.println(".".matches("\\.")); // true

        // 이메일 패턴
        // 영문소문자, 숫자가 여러개 @ 영문소문자, 숫자 여러개 . 영문소문자,숫자 여러개
        // amz940@naver3.co1m 만드시오
        String email = "[a-z0-9]{1,}@[a-z0-9]{1,}\\.[a-z0-9]{1,}";
        String email1 = "[a-z\\d]+@[a-z\\d]+\\.[a-z\\d]+";
            // +  = 1번 이상 , {1,} 같은 뜻
        System.out.println("amz940@nave1r.com".matches(email));
        System.out.println("amz940@nave1r.com".matches(email1));

        // or : | (shift + \)
        System.out.println("aqweqwedogxzcv".matches(".*dog.*"));
        System.out.println("84124catwqed".matches(".*cat.*.*"));
        System.out.println("aqweqwedogxzcv".matches(".*(dog|cat).*"));
        System.out.println("84124catwqed".matches(".*(cat|dog).*"));
            // .*(cat).* 중간에 cat만 들어가면 앞뒤에 아무거나 와도 된다.
    }
}
