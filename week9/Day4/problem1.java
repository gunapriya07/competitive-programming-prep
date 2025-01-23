// 1. Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest 
// substring
// without repeating characters.

//Solution:


class problem1 {
    public int lengthOfLongestSubstring(String s) 
    {
        boolean[] charBool = new boolean[256];
        int j = 0;
        int maxLength = 0;
        
        for (int i=0;i<s.length();i++) 
        {
            char character = s.charAt(i);
            while (charBool[character]) 
            {
                charBool[s.charAt(j)] = false;
                j++;
            }
            charBool[character] = true; 
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
}
}