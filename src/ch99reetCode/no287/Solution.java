package ch99reetCode.no287;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {
        // [3,1,3,4,2]
        Set<Integer> set = new HashSet<>();

        for ( int num : nums){
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return 0;
    }

}
