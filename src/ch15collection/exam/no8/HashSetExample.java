package ch15collection.exam.no8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "김"));
        set.add(new Student(2, "홍"));
        set.add(new Student(1, "김"));

        System.out.println("set.size() = " + set.size());
        for( Student s : set){
            System.out.println(s.getStudentNum() + ", " + s.getName());
        }

    }
}
