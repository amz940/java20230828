package ch99reetCode.no1512;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionCollect {
    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );

        System.out.println("map = " + map);

        int sum = map.values()
                .stream()
                .map(n -> (n) * (n - 1) / 2)
                .mapToInt(Long::intValue)
                .sum();
        return sum;

    }
}
