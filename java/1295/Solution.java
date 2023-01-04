import java.util.stream.IntStream;

class Solution {
    public int findNumbers(int[] nums) {
        return (int) IntStream.of(nums)
            .mapToObj(Integer::toString)
            .map(String::length)
            .filter(length -> length % 2 == 0)
            .count();
    }
}
