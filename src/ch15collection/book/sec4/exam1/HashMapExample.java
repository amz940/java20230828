package ch15collection.book.sec4.exam1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("신",85);
        map.put("홍",90);
        map.put("동",80);
        map.put("홍",95);    // 추가가 아니라 교체
        System.out.println("map.size() = " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "홍";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
//        Iterator<String> keyIterator = keySet.iterator();
//        while (keyIterator.hasNext()){
//            String k = keyIterator.next();
//            Integer v = map.get(k);
//            System.out.println(k + ": " + v);
//        }
        //향상된 for문을 활용한 반복
        for ( Map.Entry<String, Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
//        while ( entryIterator.hasNext()){
//            Map.Entry<String, Integer> entry = entryIterator.next();
//            String k = entry.getKey();
//            Integer v = entry.getValue();
//            System.out.println(k + " : " + v);
//        }
        map.forEach((key1, value1) -> System.out.println(key1 + " : " + value1));
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + " : " + value);
//            }
//        });

        System.out.println();

        // 키로 엔트리 삭제
        map.remove("홍");
        System.out.println("map.size() = " + map.size());
        System.out.println();
    }
}
