package ch12api.exam.no17;

import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch =  id.matches(regExp);
//        boolean isMatch2 =  Pattern.matches(regExp, id);
        if(isMatch){
            System.out.println("사용할수 있다");
        } else {
            System.out.println("사용할수 없다");
        }

        System.out.println(id.matches(regExp)); // false
    }
}
