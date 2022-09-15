// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        
        int reverse = 0, temp = x;  
        while(temp > 0)   
        {  
            int remainder = temp % 10;  
            reverse = reverse * 10 + remainder;  
            temp = temp/10;
        }
        
        return reverse == x;

    }
}