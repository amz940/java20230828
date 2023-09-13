package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class C17optional {
    public static void main(String[] args) {
        List<Integer> list = List.of();
        // optional : 데이터 값이 있는지 없는지 확실하지 않더라도 출력되게 해주는 코드
        // 이거 완죤.. 슈뢰딩거?
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);

//        Integer value = sum.get();
//        System.out.println("value = " + value);

        // orElse 객체의 값이 있는지 없는지 알수 없을때 있으면 객체 메소드를 실행시킨 값을
        //          없으면 orElse( )에 적힌 변수 값을 출력한다
        System.out.println("sum.orElse(0) = " + sum.orElse(0));
        System.out.println("실행");
    }
}
