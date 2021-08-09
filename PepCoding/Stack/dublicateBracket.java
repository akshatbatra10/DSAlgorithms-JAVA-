/*
 1. You are given a string exp representing an expression.
 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
 3. But, some of the pair of brackets maybe extra/needless. 
 4. You are required to print true if you detect extra brackets and false otherwise.
*/

import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean dublicate(String n) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < n.length();i++) {
            if(n.charAt(i) != ')') 
                stack.push(n.charAt(i));
            else {
                if(stack.peek() == '(')
                    return true;
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(dublicate(str));
    }

}