package ch11exception.lecture;

import java.util.List;

public class C15unchecked {
    public static void main(String[] args) {
        var list = List.of(4,5,1);
        // get은 RuntimeException이라 따로 명시 안해도 작동
        list.get(0);
        list.get(1);
        list.get(2);
        list.get(3);

        System.out.println("실행");
    }
}
