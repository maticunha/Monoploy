package edu.wit.compSci1050.project;
import java.util.Random;


public class Player implements Die, Board {
	String name;
	int value;
	int ID;
	int position;
	int lastPosition;
	int jailCounter = 0;
	int doublesCounter = 0;
	boolean inJail = false;
	boolean broke = false;
	static int currentID = 0;
	static Player currentPlayer = Board.players[0];
	
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
	
	public static Player getCurrentPlayer() {
		return players[currentID];
	}
	
	public static void setCurrentPlayer() {
		currentPlayer = Board.players[(currentID + 1) % 3];
	}
	public static int getCurrentID() {
		return currentID;
	}
	
	public static void setCurrentID() {
		currentID = (currentID + 1) % 3;
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
	public int getOwnedBy() {
		// TODO Auto-generated method stub
		return 0;
	}
	
<<<<<<< HEAD
	public void doTurn(Player current) {
		
		if (current.broke) {
			setCurrentPlayer();
			doTurn(getCurrentPlayer());
		}
		else if (inJail) {
=======
	public void doTurn(Player currentP) {
		if (inJail) {
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
			doJail();
		}
		else {
			int roll1 = rollDie();
			int roll2 = rollDie();
			if (roll1 == roll2) {
<<<<<<< HEAD
				++current.doublesCounter;
=======
				++currentP.doublesCounter;
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
			}
			
			int totalRoll = roll1 + roll2;
			
			for (int i = 0; i <= totalRoll; i++) {
<<<<<<< HEAD
				current.lastPosition = current.position;
				current.position += 1 % 40;
				if(current.lastPosition > current.position) {
=======
				currentP.lastPosition = currentP.position;
				currentP.position += 1 % 40;
				if(currentP.lastPosition > currentP.position) {
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
					setValue(200);
					/** 
					 * Code to say "pass go, collect $200
					 */
				}
			}
			
			if (spaceArr[position] instanceof  Property) {
<<<<<<< HEAD
				if((((Property) spaceArr[position]).getOwnedBy()) == current.getID()) {
=======
				if((((Property) spaceArr[position]).getOwnedBy()) == currentP.getID()) {
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
					/**
					 * Code to say you already own this, end turn					
					 */
					
				}
				
				else if(((Property) spaceArr[position]).getOwnedBy()  == 0) {
					/**
					 * Code to ask if the user wants to buy this
					 * end turn
					 */
				} 
				
				else {
					int owner = ((Property) spaceArr[position]).getOwnedBy();
					int value = spaceArr[position].getValue();
					
<<<<<<< HEAD
					current.setValue(-value / 10);
=======
					currentP.setValue(-value / 10);
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
					setValue(players[owner], value / 10);
					/**
					 * Code to say the user owed other player money
					 * end turn
					 */
					if (current.getValue() < 0) {
						broke = true;
						setCurrentPlayer();
						doTurn(getCurrentPlayer());
					}
				}
				
			}
			else if (spaceArr[position] instanceof Jail) {
				/** 
				 * Code to say user is visiting Jail
				 * End turn
				 */
				
			}
			
			else if (spaceArr[position] instanceof Event) {
				
				if(spaceArr[position].getName() == "Community Chest" || spaceArr[position].getName() == "Chance") {
					String result = ((Event) spaceArr[position]).getEvent();
					/**
					 * Code to output result
					 */
					if (((Event) spaceArr[position]).getGoodOrBad() == 1) {
<<<<<<< HEAD
						current.setValue(-50);
						
						if (current.getValue() < 0) {
							broke = true;
							setCurrentPlayer();
							doTurn(getCurrentPlayer());
						}
=======
						currentP.setValue(-50);
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
					}
					
					else {
<<<<<<< HEAD
						current.setValue(50);
=======
						currentP.setValue(50);
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
					}
				} //if for community/chance
				
				else if (spaceArr[position].getName() == "Income Tax") {
					/**
					 * Code to say player has to pay tax
					 */
					
<<<<<<< HEAD
					current.setValue(-200);
					
					if (current.getValue() < 0) {
						broke = true;
						setCurrentPlayer();
						doTurn(getCurrentPlayer());
					}
=======
					currentP.setValue(-200);
>>>>>>> branch 'master' of https://github.com/maticunha/Monopoly.git
				}
				
				else if (spaceArr[position].getName() == "Free Parking") {
					/**
					 * Code to say player gets to park for free!
					 */
				}
				
				else if(spaceArr[position].getName() == "Go To Jail") {
					inJail = true;
					/**
					 * Code to send player to jail
					 * Code to display that the player is in jail
					 */
					setCurrentPlayer();
					doTurn(getCurrentPlayer());
				}
				
				
			}
			
			if (doublesCounter == 1 || doublesCounter == 2) {
				setCurrentPlayer();
				doTurn(getCurrentPlayer());
			}
			
			else if (doublesCounter == 3) {
				inJail = true;
				/**
				 * Code to say player is in Jail
				 * Move player to jail
				 */
				
				setCurrentPlayer();
				doTurn(getCurrentPlayer());
			}
			else {
				setCurrentPlayer();
				doTurn(getCurrentPlayer());
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
			
			if (this.getValue() < 0) {
				broke = true;
				setCurrentPlayer();
				doTurn(getCurrentPlayer());
			}
			inJail = false;
			doTurn(getCurrentPlayer());
		}
		else if (tryRoll) {
			int roll1 =  rollDie();
			int roll2 = rollDie();
				if (roll1 == roll2) {
					inJail = false;
					doTurn(getCurrentPlayer());
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
					doTurn(getCurrentPlayer());
					/**
					 * Code to say you got out!
					 */
				}
				else {
					/**
					 * Code to say breakout failed, pay 50 dollars and continue turn
					 */
					setValue(-50);
					
					if (this.getValue() < 0) {
						broke = true;
						setCurrentPlayer();
						doTurn(getCurrentPlayer());
					}
					inJail = false;
					doTurn(getCurrentPlayer());
				}
		}
	}



}
