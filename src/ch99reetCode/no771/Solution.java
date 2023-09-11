package ch99reetCode.no771;

import ch07extends.book.sec07.exam151.C;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();
        for ( char c : jewels.toCharArray()){
            jewelSet.add(c);
        }

//        System.out.println(jewelSet);

        int count = 0;
        for( char c : stones.toCharArray()){
            if (jewelSet.contains(c)) {
                count ++;
            }
        }

        return count;

    }
}
