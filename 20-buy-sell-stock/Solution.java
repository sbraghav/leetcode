public class Solution {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapest = prices[0];
        for(int price : prices){
            if(price < cheapest){
                cheapest = price;
            }else{
                int profit = price - cheapest;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
                
        return maxProfit;
    }

    public static void main(String args[]) {
        System.out.println("hello");
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
