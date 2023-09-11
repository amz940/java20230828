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
        set.add("qwe");

        Iterator<String> iterator = set.iterator(); // iterator : 순서대로 탐색한다

//        String next = iterator.next();
//        System.out.println("next = " + next);
//        String next1 = iterator.next();
//        System.out.println("next1 = " + next1);
//        String next2 = iterator.next();
//        System.out.println("next2 = " + next2);
//        String next3 = iterator.next(); // set은 중복저장이 안되어서 출력이 안된다
//        System.out.println("next3 = " + next3);

        while ( iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next);
        }
//        while(iterator.hasNext()){
//            //객체를 하나씩 가져오기
//            String element = iterator.next();
//            System.out.println(element);
//            if(element.equals("JSP")){
//                //가져온 객체를 컬렉션에서 제거
//                iterator.remove();
//            }
//        }
        System.out.println();
        //객체 제거
        set.remove("JDBC");

        //객체를 하나씩 가져와서 처리
        for(String a : set){
            System.out.println(a);
        }
    }

}
