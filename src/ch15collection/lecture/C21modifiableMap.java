package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21modifiableMap {
    public static void main(String[] args) {
        Map<String,Integer> map  = Map.of(
                "손",31,
                "강",21,
                "김",26
        );
//        map.put("기",37);
//        System.out.println("실행");

        Map<String,Integer> map2 = new HashMap<>(map);
        map2.put("기",37);
        System.out.println("실행");
        System.out.println("map.size() = " + map.size());
        System.out.println("map2.size() = " + map2.size());
    }
}
