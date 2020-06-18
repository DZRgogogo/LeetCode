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

}
