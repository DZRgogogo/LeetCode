package cn.dengge;

/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
注意：你不能在买入股票前卖出股票。
 
示例 1:
输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
示例 2:
输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。

 */


public class BestTimetoBuyandSellStock121 {
    // 暴力
    public static int maxProfit(int[] prices) {
        int max_num = 0;
        for(int i = 0;i< prices.length-1;i++){
            for(int j = i+1;j<= prices.length-1;j++){
                int price_a = prices[i];
                int price_b = prices[j];
                int temp_pro = price_b - price_a;
                if( price_a < price_b && temp_pro > max_num){
                    max_num = temp_pro;
                }
            }
        }
        return max_num;
    }
    // 非暴力
    public static int maxProfit1(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int min_num = prices[0];
        int max_pro = 0;
        for(int i = 0;i < prices.length;i++){
            if( min_num < prices[i] && max_pro < prices[i]-min_num ){
                max_pro = prices[i]-min_num;
            }
            if( min_num > prices[i] ){
                min_num = prices[i];
            }
        }
        return max_pro;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int aaa = maxProfit1(nums);
        System.out.println(aaa);
    }
}
