package ch99reetCode.no1512;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numIdenticalPairs() {
        Solution o1 = new Solution();
        int i = o1.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        assertEquals(4, i);
        int j = o1.numIdenticalPairs(new int[]{1, 1, 1, 1});
        assertEquals(6, j);
        int k = o1.numIdenticalPairs(new int[]{1, 2, 3});
        assertEquals(0, k);
    }
}