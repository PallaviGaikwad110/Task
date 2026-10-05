package Task;

public class ProfitLoss {
	 public static void main(String[] args) {

	        int cost_price = 500;
	        int selling_price = 600;

	        if (selling_price > cost_price) {
	            int profit = selling_price - cost_price;
	            System.out.println("Profit = " + profit);
	        }
	        else if (cost_price > selling_price) {
	            int loss = cost_price - selling_price;
	            System.out.println("Loss = " + loss);
	        }
	        else {
	            System.out.println("No Profit, No Loss");
	        }
	    }

}
