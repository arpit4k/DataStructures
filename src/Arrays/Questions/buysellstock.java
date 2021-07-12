package Questions;
//Given a an array depicting price of a stock on different days
//We need to return the maximum profit after buying and selling a stock on different days
public class buysellstock {
    static int profit(int prices[], int n){
        int profitmax = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1;j<n;j++){
                int profit = prices[j] - prices[i];
                if(profit>profitmax){
                    profitmax = profit;
                }
            }
        }
        //Alternate approach, comment everything above
        // int minprice = Integer.MAX_VALUE;
        // int profitmax = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     if (prices[i] < minprice)
        //         minprice = prices[i];
        //     else if (prices[i] - minprice > profitmax)
        //         profitmax = prices[i] - minprice;
        // }
        return profitmax;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,2,5,6,3};
        int n = arr.length;
        int max = profit(arr, n);
        System.out.println("The maximum profit is: "+max);
    }
}
