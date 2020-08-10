package com.denggeniubi.www;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 541456313
 */
public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        int p = 0;
        for (int q= 1;q<nums.length;q++){
            if(nums[p]!=nums[q])
            {
                if ((q-p)>1) {

                    nums[p+1] = nums[q];
                }
                p++;}
        }
        return p +1 ;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] nums = null;
        nums = sc.nextLine().split(" ");
        int num[] = new int [nums.length];
        for (int i =0;i<num.length;i++)
        {
            num[i] = Integer.valueOf(nums[i]);
        }
        System.out.println( removeDuplicates(num));
        System.out.println( Arrays.toString(num));
    }


}
