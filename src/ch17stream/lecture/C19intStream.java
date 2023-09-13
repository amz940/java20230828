package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        // intStream : 숫자에 관련된 스트림을 할때 코드를 깔끔하게 만들어주기 위해 사용
        // 기능은 Stream 이랑 똑같다. 코드만 단순해질뿐
        int sum1 = IntStream.of(9,10,0,3,1,2,7)
                .sum();
        System.out.println("sum1 = " + sum1); // 32
        // int일 경우 값이 깔끔하게 숫자로 떨어진다

        OptionalInt max1 = IntStream.of(9, 10, 0, 3, 1, 2, 7)
//                .reduce(Integer::max);
                .max();
        System.out.println("max1 = " + max1); // OptionalInt[10]
        // Optional의 toString이 이렇게 값이 나오도록 정의해놔서 값이 저렇게 출력됨

        OptionalInt min1 =IntStream.of(9, 10, 0, 3, 1, 2, 7)
                .min();
        System.out.println("min1 = " + min1.getAsInt()); // 0
        // OptionalInt[0]의 값이 보기 싫다면 getAs를 붙여서 쓰면 원하는 숫자값만 출력됨

        OptionalDouble avg1 = IntStream.of(9, 10, 0, 3, 1, 2, 7)
                .average();
        System.out.println("avg1 = " + avg1);


        // 최대값 구하기
        // 최소값 구하기
        // 평균값 구하기
    }
}
