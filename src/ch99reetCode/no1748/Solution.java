package ch99reetCode.no1748;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumOfUnique(int[] nums) {
        // 1,2,3,2
        Map<Integer, Integer> map = new HashMap<>();

        for( int num : nums){
            if (map.containsKey(num)){
                // 이미 있으면
                int oldValue = map.get(num);
                map.put(num , oldValue + 1);
            } else {
                map.put(num, 1);    // 첫 발견
            }
        }

        int sum = 0;
        for ( Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue().equals(1)){
                sum += entry.getKey();
            }
        }

        // [1,1]
        System.out.println(map);

        return sum ;
    }
}
