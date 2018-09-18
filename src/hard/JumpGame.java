package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * Example:
 *
 * Input: [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2.
 *     Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Note:
 *
 * You can assume that you can always reach the last index.
 */
public class JumpGame {
    public static int solution(int[] nums) {
        int step = 0;
        int index = 0;
        if (nums.length <= 1) {
            return 0;
        }
        while (index < nums.length - 1) {
            step++;
            index = nextStep(index, nums);
        }
        return step;
    }

    public static int nextStep(int currentIndex, int[] nums) {
        int lastIndex = nums.length - 1;
        if (currentIndex + nums[currentIndex] >= lastIndex) return lastIndex;
        int maxIndex = 0;
        int pickedIndex = 1;
        for (int i = 1; i <= nums[currentIndex]; i++) {
            if (maxIndex < i + nums[i + currentIndex]) {
                pickedIndex = i;
                maxIndex = i + nums[i + currentIndex];
            }
        }
        return pickedIndex + currentIndex;
    }

    public static int solutionR(int[] nums) {
        if (nums.length <= 1) return 0;
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return getStep(numList, 0);
    }

    static int getStep(List<Integer> numList, int index) {
        if (numList.size() <= 1) return 0;
        if (numList.get(index) + index >= numList.size() -1) return 1 + getStep(numList.subList(0, index), 0);
        else return getStep(numList, ++index);
    }
}
