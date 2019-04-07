package edu.wit.compSci1050.project;
import java.util.Random;


public class Player extends Board implements Die {
	String name;
	int value;
	int ID;
	int position;
	int lastPosition;
	boolean inJail;
	int jailCounter = 0;
	int doublesCounter = 0;

	
	Player(String name,int value, int ID, int position, boolean inJail){
		super(name, position, value);
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
			
			if (boardObjects[position + 3] instanceof  Property) {
				if((Property) (boardObjects[position + 3].getOwnedBy) == getID()) {
					
				}
				
				else if(boardObjects[position + 3].getOwnedBy  == 0) {
					
				} 
				
				else {
					int owner = boardObjects[position + 3].getOwnedBy;
					int value = boardObjects[position + 3].getValue;
					
					setValue((Player) boardObjects[getID()], -value);
					setValue((Player) boardObjects[owner], value);
					
				}
				
			}
			else if (boardObjects[position + 3] instanceof Jail) {
				
			}
			
			else if (boardObjects[position + 3] instanceof Event) {
				
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
			Random roll = new Random();	
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

}
