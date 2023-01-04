/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    return nums.map(num => num.toString())
        .map(string => string.length)
        .filter(length => length % 2 == 0)
        .length;
};
