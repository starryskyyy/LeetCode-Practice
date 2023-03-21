//https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        int lo, hi, mid, result;
        lo = 0;
        hi = nums.length - 1;
        result = -1;
        while(lo <= hi){

            mid = (lo + hi) / 2;

            if(nums[mid] == target){
                result = mid;
            }
            if(nums[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return result;
    }
}
