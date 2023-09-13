package ch17stream.exam.no6;

import java.util.List;
import java.util.OptionalDouble;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                new Member("홍길동",30),
                new Member("신용권",40),
                new Member("감자바",26)
        );
        System.out.println("나이들만 출력");
        list.stream()
                .map( y -> y.getAge())
                .forEach(System.out::println);
//                        .forEach( s-> System.out.println(s.getAge()));

        System.out.println("나이들의 합 reduce로 구해서 출력");
        Integer reduce1 = list.stream()
                .map(y -> y.getAge())
                .reduce(0, ( r , e ) -> r+e );
        System.out.println("reduce1 = " + reduce1);

        System.out.println("나이들의 합 sum으로 구해서 출력");
        Integer sum = list.stream()
                .map(y -> y.getAge())
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        System.out.println("가장 많은 나이 reduce로 출력");
        Integer maxAge = list.stream()
                .map(y -> y.getAge())
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("maxAge = " + maxAge);
//        list.stream()
//                .map( y -> y.getAge())
//                .sorted()
//                .skip(list.size()-1)
//                .forEach(System.out::println);

        System.out.println("가장 적은 나이 reduce로 출력");
        Integer minAge = list.stream()
                .map(y -> y.getAge())
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("minAge = " + minAge);

        System.out.println("평균 구하기");
        OptionalDouble average = list.stream()
//                .map(y -> y.getAge())
                .mapToInt(Member::getAge)
                .average();
        System.out.println("average = " + average.getAsDouble());


    }
}
