package Arrays;

public class BestTimeToBuyandSell {
	
	public static int Maxprofit(int [] prices)
	{
		if(prices.length==0)
			return 0;
		
		int profit=0;
		for(int i=0;i<prices.length-1;i++)
		{
			if(prices[i]<prices[i+1])
				profit+=prices[i+1]-prices[i];
		}
		return profit;
	}

	public static void main(String[] args) {
		int [] prices= {50,10,45,67,98};
		System.out.println("Maximum profit is "+Maxprofit(prices));

	}

}
