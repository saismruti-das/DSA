class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        expectedSum=n*(n+1)//2
        actualSum=sum(nums)
        return expectedSum-actualSum


        # actualSum=0
        # for i in nums:
        #     actualSum+=i
        # return expectedSum-actualSum

        
