package ch99reetCode.no1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int num : nums){
            if (map.containsKey(num)){
                // 처음이 아니면
                map.put(num , map.get(num)+1);
            } else {
                // 처음이면
                map.put(num, 1);
            }
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();

            int midSum = (value) * (value-1) / 2;
            sum += midSum;
        }
        return sum;
    }
}
