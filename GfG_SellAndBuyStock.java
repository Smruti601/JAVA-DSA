public class GfG_SellAndBuyStock {

    static int maxProfit(int [] prices){
        int res=0;
        for(int i = 1 ; i< prices.length ; i++){
            if(prices[i] > prices[i-1]){
                res+=prices[i]-prices[i-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // int [] prices = {100,180,260,310,40,535,695};
        int [] prices = {4,2,2,2,4};
        System.out.println(maxProfit(prices));
    }
}
