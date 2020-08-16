package com.denggeniubi.www;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement169 {
    public static int majorityElement(int[] nums) {
//        输入: [2,2,1,1,1,2,2]
//        输出: 2
        //这种方法叫做摩尔投票法
        int index = nums[0];
        int sum = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != index) {
                sum--;
            } else {
                sum++;
            }
            if (sum < 0) {
                index = nums[i];
                sum = 1;
            }
        }
        return index;
    }

    public static int majorityElement1(int[] nums) {
        //历整个数组，对记录每个数值出现的次数(利用HashMap，其中key为数值，value为出现次数)；
        //接着遍历HashMap中的每个Entry，寻找value值> nums.length / 2的key即可。
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long limit = nums.length >> 1;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() > limit) {
                return entry.getKey();
            }
        }
        return -1;

    }

    public static int majorityElement2(int[] nums) {
//        排序思路
//        既然数组中有出现次数> ⌊ n/2 ⌋的元素，那排好序之后的数组中，相同元素总是相邻的。
//        即存在长度> ⌊ n/2 ⌋的一长串 由相同元素构成的连续子数组。
//        举个例子：
//        无论是1 1 1 2 3，0 1 1 1 2还是-1 0 1 1 1，数组中间的元素总是“多数元素”，毕竟它长度> ⌊ n/2 ⌋。n
                Arrays.sort(nums);
                return nums[nums.length >> 1];
    }
    public static void main(String[] args) {
        int nums[] = {10, 9, 9, 9, 10};
        int aaa = majorityElement(nums);
        System.out.println(aaa);
    }
}
