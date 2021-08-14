/*
 You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

 We repeatedly make duplicate removals on s until we no longer can.

 Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
*/

class Solution {
    public String removeDuplicates(String s) {
        char[] ch = new char[s.length()];
        int k = -1;
        for(char c: s.toCharArray()) {
            if(k >= 0 && ch[k] == c)
                k--;
            else
                ch[++k] = c;
        }
        return String.valueOf(ch, 0, k+1);
    }
}