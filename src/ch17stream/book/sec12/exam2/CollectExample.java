package ch17stream.book.sec12.exam2;

import ch17stream.book.sec12.exam1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동","남",97));
        list.add(new Student("김수영","여",87));
        list.add(new Student("감자바","남",95));
        list.add(new Student("오해영","여",93));

        Map<String, List<Student>> map = list.stream()
                .collect(
                        Collectors.groupingBy(Student::getSex)
                );

        List<Student> maleList = map.get("남");
        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> female = map.get("여");
        female.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
