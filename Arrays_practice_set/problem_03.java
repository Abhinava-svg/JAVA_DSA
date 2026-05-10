public class problem_03 {
    public static int BuyandSellstocks(int[] stocks){
        int Buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i< stocks.length; i++){
            if(Buyprice < stocks[i]){ //profit
                int profit = stocks[i] - Buyprice;// today's profit
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                Buyprice = stocks[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int stocks[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyandSellstocks(stocks));
    }
}
