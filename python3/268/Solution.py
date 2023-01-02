class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        length_of_list = len(nums)

        expected_sum = length_of_list * (length_of_list + 1) // 2
        actual_sum = sum(nums)

        return expected_sum - actual_sum
