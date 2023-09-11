package ch99reetCode.no1684;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        for ( char c : allowed.toCharArray()){
            chars.add(c);
        }
//        // word : "ad"
//        chars.contains('a');
//        chars.contains('d');
//
//        // word : "badab"
//        chars.contains('b');
//        chars.contains('a');
//        chars.contains('d');
//        chars.contains('a');
//        chars.contains('b');
//
//        // word : "baa"
//        chars.contains('b');
//        chars.contains('a');
//        chars.contains('a');

        int count = 0;
        for ( String word : words ) {
            boolean consistentString = true;
            for (char c : word.toCharArray()) {
                if (!chars.contains(c)) {
                    consistentString = false;
                    break;
                }
            }
            if (consistentString) {
                count++;
            }
        }
        return count;
    }
}
