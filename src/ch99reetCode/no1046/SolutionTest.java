package ch99reetCode.no1046;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lastStoneWeight() {
        Solution o1 = new Solution();
        int result1 = o1.lastStoneWeight(new int[]{2,7,4,1,8,1});
        assertEquals(1, result1);

        int result2 = o1.lastStoneWeight(new int[]{1});
        assertEquals(1, result2);

        int result3 = o1.lastStoneWeight(new int[]{3,3});
        assertEquals(0, result3);
    }
}