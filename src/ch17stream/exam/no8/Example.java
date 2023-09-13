package ch17stream.exam.no8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나라", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> map = list.stream()
                .collect(
                        Collectors.groupingBy(Member::getJob)
                );

        System.out.println("개발자");
        map.get("개발자").forEach(System.out::println);

//        List<Member> list1 = list.stream()
//                .filter(y -> y.getJob().equals("개발자"))
//                .toList();
//        System.out.println("list1 = " + list1);

//        list.stream()
//                .filter(y -> y.getJob().equals("개발자"))
//                .toList()
//                .forEach(System.out::println);

        System.out.println();

        System.out.println("디자이너");
        map.get("디자이너").forEach(System.out::println);

//        List<Member> list2 = list.stream()
//                .filter(a -> a.getJob().equals("디자이너"))
//                .collect(Collectors.toList());
//        System.out.println("list2 = " + list2);
    }
}
