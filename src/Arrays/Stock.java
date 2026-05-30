//Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Examples
/*Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.*/

package Arrays;
import java.util.*;
public class Stock

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of prices");
        int n=sc.nextInt();
        int prices[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            prices[i]=sc.nextInt();

        int buy=0,sell=1;
        int profit=0;

        while(buy<sell && sell<n)
        {
            if(prices[sell]<=prices[buy])
            {
                buy=sell;
                sell=buy+1;
            }
            else
            {
                int newprofit=prices[sell]-prices[buy];
                profit=Math.max(profit,newprofit);
                sell++;
            }
        }
        System.out.println(profit);
    }

}

