/*
 1. You are given a string exp representing an expression.
 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
*/

import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean balanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                stack.push(str.charAt(i));
            else if(str.charAt(i) == ')') {
                if(stack.size() == 0)
                    return false;
                else if(stack.peek() != '(')
                    return false;
                stack.pop();
            }
            else if(str.charAt(i) == '}') {
                if(stack.size() == 0)
                    return false;
                else if(stack.peek() != '{')
                    return false;
                stack.pop();
            }
            else if(str.charAt(i) == ']') {
                if(stack.size() == 0)
                    return false;
                else if(stack.peek() != '[')
                    return false;
                stack.pop();
            }
        }
        if(stack.empty() == false)
            return false;
        return true;
    } 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(balanced(str));
    }

}