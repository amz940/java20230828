package ch17stream.book.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,12};
        //2의 배수 개수
        long count = Arrays.stream(arr)
                .filter( x -> x%2 == 0)
                .count();
        System.out.println("count = " + count);

        //2의 배수 총합
        int sum = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println("sum = " + sum);

        //2의 배수 평균
        OptionalDouble avg = Arrays.stream(arr)
                .filter(x -> x%2 ==0)
                .average();
        System.out.println("avg = " + avg.getAsDouble());

        //최대값
        OptionalInt max = Arrays.stream(arr)
                .max();
        System.out.println("max = " + max.getAsInt());

        //최소값
        OptionalInt min = Arrays.stream(arr)
                .min();
        System.out.println("min = " + min.getAsInt());

        //첫번째 요소
        OptionalInt first = Arrays.stream(arr)
                .sorted()
                .filter( x -> x%2 == 1)
                .findFirst();
        System.out.println("first = " + first.getAsInt());


    }
}
