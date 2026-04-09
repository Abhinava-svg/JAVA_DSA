public class Array_12 {
    public static int Buyandsellstocks(int Stocks[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < Stocks.length; i++){
            if(buyprice < Stocks[i]){ //profit
                int profit = Stocks[i] - buyprice; // today's profit
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = Stocks[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args){
        int Stocks[] = {7, 1, 5, 3, 6, 4};
        System.out.println(Buyandsellstocks(Stocks));
    }
}
