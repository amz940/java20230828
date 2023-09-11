package ch99reetCode.no1748;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumOfUnique() {
        Solution o1 = new Solution();
        assertEquals(4, o1.sumOfUnique(new int[]{1,2,3,2}));
        assertEquals(0, o1.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        assertEquals(15, o1.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}