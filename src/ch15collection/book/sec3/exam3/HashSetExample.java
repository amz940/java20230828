package ch15collection.book.sec3.exam3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("JSP");
        set.add("spring");
        set.add("java");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            //객체를 하나씩 가져오기
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                //가져온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();
        //객체 제거
        set.remove("JDBC");

        //객체를 하나씩 가져와서 처리
        for(String a : set){
            System.out.println(a);
        }
    }

}
