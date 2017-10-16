package bitSim;

public class trading {
	
	public static int buy(int money, int price){
		money-=price;
		
		return money;
		
	}
	
	public static int sell(int money, int price){
		money+=price;
		
		return money;
		
	}

}
