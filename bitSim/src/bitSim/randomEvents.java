package bitSim;

import java.util.Random;

public class randomEvents {
	
	public static int trend(int price) {
		Random r = new Random();
		int change, direction;
		
		change = r.nextInt(501);
		direction = r.nextInt(25) + 1;
		
		if(direction<10){
			change = change * -1;
		}
		
		price += change;
		
		
		
		int chance;
		chance = r.nextInt(100)+1;
		
		if(chance<=4){
			change = r.nextInt(2500-750+1) + 500;
		}
		
		if(chance==1 || chance==2){
			change = change * -1;
		}
		
		price += change;
		
		return price;
	}

}
