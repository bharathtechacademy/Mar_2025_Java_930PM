package assignments;

public class Assignment11_StockMarket {

    public static void main(String[] args) {

        // Array representing the stock prices over different days
        // Each element corresponds to the price of the stock on that day
        int[] prices = { 7, 5, 4, 3, 2, 1 };

        // Variable to store the maximum profit observed so far
        int maxProfit = 0;

        // Variables to store the best day to buy and sell the stock (1-based index)
        int buyDay = 0;
        int sellDay = 0;

        // Outer loop: pick each day as a potential buying day
        for (int i = 0; i < prices.length - 1; i++) {

            // Inner loop: pick each subsequent day as a potential selling day
            for (int j = i + 1; j < prices.length; j++) {

                // Calculate the profit if we buy on day i and sell on day j
                int profit = prices[j] - prices[i]; // e.g., profit = price at j - price at i

                // If this profit is greater than the current maximum profit
                if (profit > maxProfit) {

                    // Update maxProfit with the new higher profit
                    maxProfit = profit;

                    // Update buyDay and sellDay (adding +1 to convert from 0-based to 1-based indexing)
                    buyDay = i + 1;
                    sellDay = j + 1;
                }
            }
        }

        // After checking all combinations, print the result based on whether profit is possible
        if (maxProfit > 0) {
            // If profit is positive, print the max profit and the days to buy/sell
            System.out.println(" maxProfit is " + maxProfit);
            System.out.println("Buy the share on day " + buyDay);
            System.out.println("Sell the share on day " + sellDay);
        } else {
            // If no profit is possible, warn the user
            System.out.println("You will lose your money, don't buy this share");
        }

    }
}
