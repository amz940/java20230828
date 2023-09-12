package ch17stream.lecture;

import java.util.List;

public class C05terminal {
    public static void main(String[] args) {
        // 최종 연산, 연산 후 해당 stream 사용 불가
        // 연산 시 , 속해 있는 중간 연산 전부 실행 후 종료
        List<String> list = List.of("css","html","spring");
        long count = list.stream()
                .count();

        System.out.println("count = " + count);
    }
}
