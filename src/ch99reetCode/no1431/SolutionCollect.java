package ch99reetCode.no1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionCollect {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies)
                .max()
                .getAsInt();

        return Arrays.stream(candies)
                .map( x -> x + extraCandies)
                .mapToObj( x -> x >= max)
                .toList();

    }
}
