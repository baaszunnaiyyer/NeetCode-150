public class BestTimeToBuyAndSellStock {

    public static int buyAndSellStock(int[] numbs){

        // initializing minimum number and profit it gained
        int min = numbs[0];
        int profit = 0;

        // looping through the whole list
        for(int i = 0; i< numbs.length; i++){

            //checking condition for the min number and current number
            if(numbs[i]< min){
                min = numbs[i];
            }

            // calculating the profit buy the minimum number and the day the profit is sold
            profit = Math.max(profit, numbs[i]-min);
        }
        return profit;
    }

    public static void main(String[] args) {
        
        int[] numbs = {7,1,5,3,6,4};
        System.out.println(buyAndSellStock(numbs));

    }
}
