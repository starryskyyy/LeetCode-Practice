// https://github.com/Hoon-Yim/PS/blob/main/easy/leetcode_141.py

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String st = "";
        char ch;
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++)
            if (min > strs[i].length())
                min = strs[i].length();


        for (int i = 0; i < min; i++) {
            ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++)
                if (ch != strs[j].charAt(i))
                    return st;
            st += ch;
        }
        return st;
        
    }
    
}