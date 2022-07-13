public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        //Wrong
        //System.out.println(maxProfit(new int[]{2, 4, 1}));

        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int val: new int[]{1, 2}) {
            min = Math.min(min, val);
            ans = Math.max(ans, val - min);
        }
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        if (prices.length < 2){
            return 0;
        }

        int buyPos = 0, buyVal = prices[0], sellVal = -1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyVal){
                buyPos = i;
                buyVal = prices[i];
            }
        }

        for (int i = buyPos; i < prices.length; i++) {
            if (prices[i] > sellVal){
                sellVal = prices[i];
            }
        }

        if (sellVal < 0) return 0;

        return sellVal - buyVal;
    }
}
