// https://leetcode.com/problems/binary-search/

class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        lo = 0;
        hi = len(nums) - 1;

        while(lo <= hi):
            mid = (lo + hi) / 2;
            if (nums[mid] == target):
                return mid;
            if (nums[mid] < target):
                lo = mid + 1;
            else:
                hi = mid - 1;
        
        return -1;