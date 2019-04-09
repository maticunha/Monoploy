package edu.wit.compSci1050.project;
//comments
import java.util.Random;

public class Jail implements Space {
	String name;
	int position;
	

	public Jail(String name, int position) {
		this.name = name;
		this.position = position;
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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPosition(int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setValue(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getOwnedBy() {
		// TODO Auto-generated method stub
		return 0;
	}
}
