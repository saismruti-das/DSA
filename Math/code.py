class Solution:
    def reverse(self, x: int) -> int:
        s=str(abs(x))
        rev=int(s[::-1])
        if rev> (-2**31) and rev<((2**31) - 1):
            if x>0:
                return rev
            else:
                return rev*-1
        else:
            return 0
