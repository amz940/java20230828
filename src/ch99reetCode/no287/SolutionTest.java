package ch99reetCode.no287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDuplicate() {
        Solution o1 = new Solution();
        int num1 = o1.findDuplicate(new int[]{1,3,4,2,2});
        assertEquals(2, num1);

        int num2 = o1.findDuplicate(new int[]{3,1,3,4,2});
        assertEquals(3,num2);
    }
}