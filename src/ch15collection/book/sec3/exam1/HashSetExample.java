package ch15collection.book.sec3.exam1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("JSP");
        set.add("spring");
        set.add("spring");

        int size = set.size();
        System.out.println(size);

    }
}
