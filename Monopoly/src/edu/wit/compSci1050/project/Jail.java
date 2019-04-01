package edu.wit.compSci1050.project;

import java.util.Random;

public class Jail extends Space {
	
	

	public Jail(String name, int position, int value) {
		super(name, position, value);
		// TODO Auto-generated constructor stub
	}

	public boolean tryRoll() {
		
		Random randomRoll = new Random();
		
		int die1 = randomRoll.nextInt(5);
		int die2 = randomRoll.nextInt(5);
		
		if (die1 == die2) {
			return true;
			
		}
		
		
		return false;
		
		
	}
}
