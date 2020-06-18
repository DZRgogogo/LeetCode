package com.denggeniubi.www;

import java.lang.reflect.Array;
import java.util.*;

public class SumOfTwoNumber {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            hashmap.put(nums[i],i);
        }
        for (int i = 0;i<nums.length;i++)
        {
            int a = target - nums[i];//
            boolean flag = hashmap.containsValue(a);
            if (flag && (hashmap.get(a)!= i))
            {
                return new int[]{i,hashmap.get(a)};
            }
        }
        throw  new IllegalArgumentException("no");
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        int a;
        Scanner s = new Scanner(System.in);
//        while (s.hasNext())
//        {
//            a = s.nextInt();
//        }

//        int a = s.nextInt();
//        int b;
//        for(int i = 0;i<a;i++)
//        {
//            b = s.nextInt();
//            nums[i] = b;
//        }
//        for(int x :nums)
//        {
//            System.out.print(x);
//        }
        System.out.println(Arrays.toString(nums));

    }
}
