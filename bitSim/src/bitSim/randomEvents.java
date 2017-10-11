package bitSim;

import java.util.Random;

public class randomEvents {

	public static int randomEvent() {
		Random r = new Random();
		int chance, change=0;
		
		chance = r.nextInt(100)+1;
		
		if(chance<=4){
			change = r.nextInt(1500-500+1) + 500;
		}
		
		if(chance==1 || chance==2){
			change = change * -1;
		}
		
		return change;
	}
	
	public static int trend() {
		Random r = new Random();
		int change, direction;
		
		change = r.nextInt(501);
		direction = r.nextInt(25) + 1;
		
		if(direction<10){
			change = change * -1;
		}
		
		return change;
	}

}
