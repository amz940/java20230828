package ch17stream.book.sec12.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동","남",97));
        totalList.add(new Student("김수영","여",87));
        totalList.add(new Student("감자바","남",95));
        totalList.add(new Student("오해영","여",93));

        //남학생만 묶어서 리시트
        List<Student> man = totalList.stream()
                .filter(y-> y.getSex().equals("남"))
                .collect(Collectors.toList());
//                .toList();
//                .map(y -> "남") // 성별만 싹 바뀜

        man.stream()
                .forEach( y-> System.out.println(y.getName()));

        Map<String, Object> collect2 = totalList.stream()
                .collect(Collectors.toMap(
                        z -> z.getName(),
                        y -> y.getScore()
                ));
        System.out.println(collect2);
    }
}
