package ch99reetCode.no1748;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionCollect {
    public int sumOfUnique(int[] nums) {
        // 1,2,3,2

        // 수가 몇개 인지  counting
        // 1개인 entry만 거르고  filter
        // entry의 키들만 더하기
        return Arrays.stream(nums)
                .boxed() // 참조형으로 바꾸기
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting()))
                // 1개인 entry를 거르고
                // map 에서 stream으로  바꾸는 코드가 없다
                // set 에서 stream으로 바꿀 수 있고
                // map 에서 set으로 바꿀 수 있다보니
                // map -> set -> stream  : entrySet 이다
                .entrySet()
                .stream() // 정렬
                .filter(e -> e.getValue() == 1)
                // entry의 키들만 뽑아서
                .map( e -> e.getKey())
                .mapToInt(Integer::intValue)
                // 더한다
                .sum();
    }
}
