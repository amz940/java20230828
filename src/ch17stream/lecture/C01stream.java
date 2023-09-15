package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "react");

        for (String item : list){
            System.out.println("item = " + item);
        }

        // stream
        // 물처럼 흘러간다 해서 stream
        // 한번 지나간 데이터는 못 받는다
        Stream<String> stream = list.stream();

        // 메소드
        // 중간연산 : intermediate operation , 중간에 여러번 사용가능
        // 최종연산 : terminal operation , 마지막 한번만 가능

        // 최종연산 후 stream 재사용 불가
        // 최종연산 시 중간연산을 전부 같이 처리함

        stream.limit(5); // 중간연산 , 확인하는법은 crtl + q
        stream.count();
    }
}
