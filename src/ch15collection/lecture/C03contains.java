package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("spring"));

        boolean c = list1.contains(new String("java"));
        System.out.println("c = " + c); // true  why?

    }
}
