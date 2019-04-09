package edu.wit.compSci1050.project;
import java.util.Random;


public class Player implements Die, Board {
	String name;
	int value;
	int ID;
	int position;
	int lastPosition;
	boolean inJail;
	int jailCounter = 0;
	int doublesCounter = 0;

	
	Player(String name,int value, int ID, int position, boolean inJail){
		this.name = name;
		this.value = value;
		this.position = position;
		this.ID = ID;
		inJail = false;
	}
	
	public String getName() {
		return name;
		
	}

	
	public int getID() {
		return ID;
		
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int n) {
		value += n;
	}
	
	public void setValue(Player n, int v) {
		n.setValue(v);
	}
	
	public int nextPlayer() {
		 return (getID() + 1) % 3 == 0? 1 : getID() + 1;
	}

	@Override
	public int rollDie() {
		Random roll = new Random();	
		int roll1 =  roll.nextInt(6) + 1;
		
		
		
		//insert code to display die
		
		return roll1;
	}
	
	public void doTurn(int ID) {
		if (inJail) {
			doJail();
		}
		else {
			int roll1 = rollDie();
			int roll2 = rollDie();
			if (roll1 == roll2) {
				++doublesCounter;
			}
			
			int totalRoll = roll1 + roll2;
			
			for (int i = 0; i <= totalRoll; i++) {
				lastPosition = position;
				position += 1 % 40;
				if(lastPosition > position) {
					setValue(200);
				}
			}
			
			if (spaceArr[position] instanceof  Property) {
				if((spaceArr[position].getOwnedBy) == getID()) {
					
				}
				
				else if(spaceArr[position].getOwnedBy  == 0) {
					
				} 
				
				else {
					int owner = spaceArr[position].getOwnedBy;
					int value = spaceArr[position].getValue;
					
					setValue(-value);
					setValue(players[owner], value);
					
				}
				
			}
			else if (spaceArr[position + 3] instanceof Jail) {
				
			}
			
			else if (spaceArr[position + 3] instanceof Event) {
				
			}
			
			if (doublesCounter > 1) {
				doTurn(getID());
			}
			
			else {
				doTurn(nextPlayer());
			}
		}
	}
	
	public void doJail() {
		boolean tryRoll = false;
		boolean pay = false;
		
		
		/**
		 * Insert code here to display options 
		 * Do you want to roll?
		 * Do you want to pay?
		 * Buttons that do both.
		 */
		if (pay) {
			setValue(-50);
			inJail = false;
			doTurn(getID());
		}
		else if (tryRoll) {
			int roll1 =  rollDie();
			int roll2 = rollDie();
				if (roll1 == roll2) {
					inJail = false;
					doTurn(getID());
					/**
					 * Code to say "hey you got out!"
					 */
				}
				else {
					++jailCounter;
					/**
					 * Code to say "still in jail."
					 */
				}
		}
		else if (tryRoll && jailCounter == 2) {
			int roll1 =  rollDie();
			int roll2 = rollDie();
				if (roll1 == roll2) {
					inJail = false;
					doTurn(getID());
					/**
					 * Code to say you got out!
					 */
				}
				else {
					/**
					 * Code to say breakout failed, pay 50 dollars and continue turn
					 */
					setValue(-50);
					inJail = false;
					doTurn(getID());
				}
		}
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

}
