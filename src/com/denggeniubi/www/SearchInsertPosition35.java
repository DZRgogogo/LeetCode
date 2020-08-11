package cn.dengge;
//    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//    你可以假设数组中无重复元素。
//    示例 1:
//
//    输入: [1,3,5,6], 5
//    输出: 2
//    示例 2:
//
//    输入: [1,3,5,6], 2
//    输出: 1
//    示例 3:
//
//    输入: [1,3,5,6], 7
//    输出: 4
//    示例 4:
//
//    输入: [1,3,5,6], 0
//    输出: 0

public class SearchInsertPosition35 {
    // 暴力
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]<target)
            {
                index ++;
            }
            else
            {
                break;
            }
        }
        return  index;
    }
    //二分查找
    public static int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left<=right)
        {
            int mid = (left+right)/2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }
        }
        return  left;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
       int aaa = searchInsert1(nums,7);
        System.out.println(aaa);

    }
}
