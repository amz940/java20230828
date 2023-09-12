package ch15collection.book.sec8;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        // list 불변 컬렉션
        List<String> list1 = List.of("a","b","c");
        // set 불변 컬렉션
        Set<String> set1 = Set.of("a","b","c");
        // map 불변 컬렉션
        Map<String, String> map1 = Map.of(
                "a","k",
                "b","l"
        );

        // List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        // copyOf를 활용해서 불변컬렉션 복사
        List<String> list2 = List.copyOf(list);
        System.out.println(list2.equals(list1));

        // Set 컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        // copyOf를 활용해서 불변컬렉션 복사
        Set<String> set2 = Set.copyOf(set);

        // Map 컬렉션을 불변 컬렉션으로 복사
        Map<String, String> map = new HashMap<>();
        map.put("a","k");
        map.put("b","l");
        // copyOf를 활용해서 불변컬렉션 복사
        Map<String, String> map2 = Map.copyOf(map);

        // 배열로부터 List 불변 컬렉션 생성
        String[] arr = {"a","b","c"};
        List<String> list3 = Arrays.asList(arr);
    }
}
