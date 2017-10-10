package bitSim;

import java.util.Random;

public class randomEvents {

	public static void randomEvent() {
		Random r = new Random();
		// This is where random events are made
		
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
