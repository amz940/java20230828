package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C06nestedList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        
        row1.add(9);
        row1.add(6);  
        row1.add(4);
        System.out.println("row1 = " + row1);

        row2.add(10);
        row2.add(20);
        System.out.println("row2 = " + row2);

        list.add(row1);
        list.add(row2);
        System.out.println(list);

        System.out.println("list.get(0).get(0) = " + list.get(0).get(0)); // 첫번째 배열의 첫번쨰 인덱스 값
        System.out.println("list.get(0).get(1) = " + list.get(0).get(1));
        System.out.println("list.get(0).get(2) = " + list.get(0).get(2));

        System.out.println("list.get(1).get(0) = " + list.get(1).get(0));
        System.out.println("list.get(1).get(1) = " + list.get(1).get(1));
        
        list.add(row1);  // 배열 하나 더 추가
        System.out.println(list);

        System.out.println("list.get(2).get(0) = " + list.get(2).get(0));
        System.out.println("list.get(2).get(1) = " + list.get(2).get(1));
        System.out.println("list.get(2).get(2) = " + list.get(2).get(2));
        
        //값 교체
        list.get(0).set(0, 99);
        System.out.println(list);
        System.out.println("list.get(0).get(0) = " + list.get(0).get(0));
        System.out.println("list.get(2).get(0) = " + list.get(2).get(0)); // 9 -> 99
    }
}
