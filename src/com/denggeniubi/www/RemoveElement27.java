package cn.dengge;

import java.util.Arrays;

public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        //利用快慢指针、类似于那个消除数组中相同元素的那个题
        int i = 0;
        for (int j = 0;j<nums.length;j++){
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    //利用这种位移的方法可以更快的、因为赋值很少，充分利用了可以无顺序，数据少的时候就很高效率
    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i<n){
            if(nums[i] == val){ //相等就立马去交换位置，将确定的放到最后面
              nums[i] = nums[n-1];
              n--;//舍弃后面
            }else {//不等就往后查
                i++;
            }
        }
        return  n;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int aaa = removeElement1(nums,6);
        System.out.println(aaa);
        System.out.println(Arrays.toString(nums));
    }
}
