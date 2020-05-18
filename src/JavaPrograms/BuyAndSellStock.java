package JavaPrograms;

public class BuyAndSellStock {

	public static int maxProfit(int prices[]) {
		
		 int min = Integer.MAX_VALUE, max = 0;
	        for (int price: prices) {
	            min = Math.min(min, price);
	            max = Math.max(price - min, max);
	        }
	        return max;
		    
	}

	public static void main(String[] args) {
	
int[] prices = {1,3,7,5,12,1,8};
System.out.println(maxProfit(prices));
}

}
