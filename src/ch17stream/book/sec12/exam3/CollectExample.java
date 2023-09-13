package ch17stream.book.sec12.exam3;

import ch17stream.book.sec12.exam1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectExample {
    public static void main(String[] args) {

    List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동","남",97));
        list.add(new Student("김수영","여",87));
        list.add(new Student("감자바","남",95));
        list.add(new Student("오해영","여",93));

        Map<String, Double> map = list.stream()
                .collect(
                        groupingBy(Student::getSex, averagingDouble(Student::getScore))
                );

        System.out.println(map);
    }
}
