package com.denggeniubi.www;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//public class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
//}

public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        //未经优化的滑动窗口
        //如果右边的边界j已经与前面的[i,j)里面有重复的，那么下次i就将当前的删除（因为重复）
        //然后将左边界的下边后移一位
        //如果不重复，那就右边界继续往后走
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxlength = 0 ;
        int n = s.length();
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {


                set.add(s.charAt(j));
                j+=1;
                maxlength = Math.max(maxlength,j-i);
            } else {
                set.remove(s.charAt(i));
                i+=1;
            }
        }
        return maxlength;

    }

    public static void main(String[] args) {
        无重复字符的最长子串 s = new 无重复字符的最长子串();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a =s.lengthOfLongestSubstring(str);
        System.out.println(a);
    }
}
