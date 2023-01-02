import java.util.stream.IntStream;

class Solution {
    public int missingNumber(int[] nums) {
        int lengthOfArray = nums.length;

        int expectedSum = lengthOfArray * (lengthOfArray + 1) / 2;
        int actualSum = IntStream.of(nums).sum();

        return expectedSum - actualSum;
    }
}
