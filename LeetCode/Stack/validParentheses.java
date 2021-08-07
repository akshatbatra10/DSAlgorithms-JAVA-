/* 
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

  1) Open brackets must be closed by the same type of brackets.
  2) Open brackets must be closed in the correct order.
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        if(s.length() == 0 || s.length() % 2 != 0)
            return false;
        for(int i = 0;i < s.length();i++)
        {
            if(brackets.empty() == false) {
                if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                    char temp = brackets.pop();
                    if(temp == '(' && s.charAt(i) == ')' || temp == '{' && s.charAt(i) == '}' || temp == '[' && s.charAt(i) == ']')
                        continue;
                    else
                        return false;
                }
            }
            brackets.push(s.charAt(i));
        }
        if(brackets.empty() == false)
            return false;
        return true;
    }
}