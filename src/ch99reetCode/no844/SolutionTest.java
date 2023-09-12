package ch99reetCode.no844;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void backspaceCompare() {
        Solution o1 = new Solution();
        assertEquals(true, o1.backspaceCompare("ab#c", "ad#c"));
        assertEquals(true, o1.backspaceCompare("ab##", "c#d#"));
        assertEquals(false, o1.backspaceCompare("a#c", "b"));
        assertEquals(true, o1.backspaceCompare("a##c", "#a#c"));
    }
}