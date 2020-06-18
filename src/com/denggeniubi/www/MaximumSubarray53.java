package com.denggeniubi.www;
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//示例:
//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        //思想：
        // 前面的和如果小于0，那么就舍弃，例如，-2,1，那么在遍历到1的时候，加上前面的-2肯定更小
        //大于0就保存
        //另外维护一个maxsum保存当前最大值
        int maxSum =nums[0];
        int sum = 0;
        for (int num:nums)
        {
            sum = Math.max(num,num+sum);
            maxSum = Math.max(sum,maxSum);
        }
        return  maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray53 m = new MaximumSubarray53();
        System.out.println(m.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
