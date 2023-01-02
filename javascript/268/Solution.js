/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    var lengthOfArray = nums.length;

    var expectedSum = Math.floor(lengthOfArray * (lengthOfArray + 1) / 2);
    var actualSum = nums.reduce((a, b) => a + b, 0);

    return expectedSum - actualSum;
};
