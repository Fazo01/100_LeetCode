public class _04_Best_Time_To_Buy_And_Sell_Stock {
    public int Maxprofit(int[] nums){
        int minprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:nums){
            if (price<minprice){
                minprice=price;
            }else {
                maxProfit=Math.max(maxProfit,price-minprice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        _04_Best_Time_To_Buy_And_Sell_Stock solution=new _04_Best_Time_To_Buy_And_Sell_Stock();
        int[] nums={7,1,5,3,6,4};
        System.out.println("Max profit: "+solution.Maxprofit(nums));
    }
}