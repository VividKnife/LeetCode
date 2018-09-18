package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    void solution() {
        int[] nums1 = new int[]{2,3,1,1,4};
        assertEquals(2, JumpGame.solution(nums1));
        int[] nums2 = new int[]{2,3,1,1,4,2,3,1,1,3};
        assertEquals(4, JumpGame.solution(nums2));
        int[] nums3 = new int[]{2,1};
        assertEquals(1, JumpGame.solution(nums3));
        int[] nums4 = new int[]{1,2,3};
        assertEquals(2, JumpGame.solution(nums4));
    }

    @Test
    void solution2() {
        int[] nums1 = new int[]{2,3,1,1,4};
        assertEquals(2, JumpGame.solutionR(nums1));
        int[] nums2 = new int[]{2,3,1,1,4,2,3,1,1,3};
        assertEquals(4, JumpGame.solutionR(nums2));
        int[] nums3 = new int[]{2,1};
        assertEquals(1, JumpGame.solutionR(nums3));
        int[] nums4 = new int[]{1,2,3};
        assertEquals(2, JumpGame.solutionR(nums4));
    }
}