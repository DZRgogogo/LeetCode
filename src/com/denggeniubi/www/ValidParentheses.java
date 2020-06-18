package com.denggeniubi.www;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.empty()||stack.pop() != c  ) {
                return false;
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
        if (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            return isValid(s.replace("()", "").replace("[]", "").replace("{}", ""));
        } else {
            return "".equals(s);
        }
    }
    public static void main(String[] args) {
        String s = "[]{()}";
        String aaa ="aaa";
        System.out.println("".equals(aaa));
        System.out.println(isValid(s));


    }
}
