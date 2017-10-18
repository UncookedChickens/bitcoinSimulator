package bitSim;

import java.util.Random;

public class randomEvents {
	
	public static int trend(int price) {//changes the price of bitcoin
		// Initialize random number generator, and initialize variables
		Random r = new Random();
		int change, direction;
		
		// get a random number for how much the price of bitcoin will change, and in which direction it will go
		change = r.nextInt(501);
		direction = r.nextInt(25) + 1;
		
		// if the direction is less than 10, then make the number assigned to change to a negative
		if(direction<10){
			change = change * -1;
		}
		
		// add the changed amount to the price of bitcoin
		price += change;
		
		
		// Initialize chance variable and assign it a random number under 100
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
