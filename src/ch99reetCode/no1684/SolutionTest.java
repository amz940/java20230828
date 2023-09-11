package ch99reetCode.no1684;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void countConsistentStrings() {
        Solution o1 = new Solution();
        int i = o1.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
        assertEquals(2, i);
        int j = o1.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"});
        assertEquals(7, j);
        int k = o1.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"});
        assertEquals(4, k);
    }
}