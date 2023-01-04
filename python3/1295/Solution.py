class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        strings = list(map(str, nums))
        
        lengths = list(map(len, strings))

        return len(list(filter(lambda a: a % 2 == 0, lengths)))
