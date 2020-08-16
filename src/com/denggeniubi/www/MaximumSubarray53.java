package com.denggeniubi.www;

import java.util.Arrays;

public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {
        int max_num = nums[0];
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(sum>0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            max_num = Math.max(max_num,sum);
        }
        return max_num;
    }
    //动态规划
    // Kadane算法扫描一次整个数列的所有数值，
    // 在每一个扫描点计算以该点数值为结束点的子数列的最大和（正数和）。
    // 该子数列由两部分组成：以前一个位置为结束点的最大子数列、该位置的数值。
    // 因为该算法用到了“最佳子结构”（以每个位置为终点的最大子数列都是基于其前一位置的最大子数列计算得出,
    // 该算法可看成动态规划的一个例子。
    // 状态转移方程：sum[i] = max{sum[i-1]+a[i],a[i]}
    // 其中(sum[i]记录以a[i]为子序列末端的最大序子列连续和)
    // 类似于上面的那个
    public static int maxSubArray1(int[] nums) {
        int max_num = nums[0];
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
//            if(sum>0){
//                sum += nums[i];
//            }else{
//                sum = nums[i];
//            }
            sum = Math.max(sum + nums[i],nums[i]);//这句代码就很好的集成了上面的代码
            max_num = Math.max(max_num,sum);
        }
        return max_num;
    }
    public static void main(String[] args) {
        int nums[] = {1};
        int aaa = maxSubArray1(nums);
        System.out.println(aaa);
        System.out.println(Arrays.toString(nums));
    }
}
