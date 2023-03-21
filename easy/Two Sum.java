// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int[] result = new int[2];
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            } 
        }
        return null;
    }
}