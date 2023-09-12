package ch15collection.lecture;

import java.util.Map;

public class C18unmodifiableMap {
    public static void main(String[] args) {
        // 수정 불가 map
        Map<String, String> map = Map.of(
                "num1","hm",
                "num2","ki",
                "num3","no"
        );
        map.put("num4", "kim");

        System.out.println(map);
    }
}
