package ch17stream.lecture;

import java.util.stream.IntStream;

public class C20primitive {
    public static void main(String[] args) {
        // 기본타입 stream : IntStream , LongStream , DoubleStream
        // 참조타입 stream : Stream<T>

        // 기본타입 stream -> 참조타입 stream
        // .boxed()를 하면 변경이 가능하다
        Integer max = IntStream.of(3,8,1,2,7)
                .boxed()
                .max(Math::max)
                .get();
        System.out.println("max = " + max);


    }
}
