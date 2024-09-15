// https://leetcode.com/problems/reorganize-string/description/

// Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

// Return any possible rearrangement of s or return "" if not possible.

 

// Example 1:

// Input: s = "aab"
// Output: "aba"
// Example 2:

// Input: s = "aaab"
// Output: ""
 

// Constraints:

// 1 <= s.length <= 500
// s consists of lowercase English letters.

class Solution {
    public String reorganizeString(String s) {
        int[][] m=new int[26][2];
        for(int i=0;i<26;++i) m[i][0]=i;

        char[] ch=s.toCharArray();
        for(char c: ch) m[c-'a'][1]++;

        Arrays.sort(m, (a,b)->b[1]-a[1]);

        int ind=0, n=s.length(), mod=(n%2)==0? n-1: n;

        if(m[0][1]>Math.ceil(n/2.0)) return "";
        
        for(int i=0;i<26;++i) {
            while(m[i][1]-->0) {
                int pos = ind==mod? mod: (ind*2)%mod;
                ch[pos]=(char)(m[i][0]+'a');
                ind++;
            }
        }
        return new String(ch);
    }
}