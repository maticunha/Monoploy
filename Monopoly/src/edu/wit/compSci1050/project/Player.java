package edu.wit.compSci1050.project;
import java.util.Random;

//comments 


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
	public static int currentID = 0;
	public static Player currentPlayer;
	
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
		return App.players[currentID];
	}
	
	public static void setCurrentPlayer() {
		currentPlayer = App.players[(currentID + 1) % 3];
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
	

	public void doTurn(Player current) {
		//checks if player has negative money
		if (current.broke) {
			setCurrentPlayer();
			
		}
		//checks to see if player is in jail
		else if (inJail) {

			doJail();
		}
		else {
			int roll1 = rollDie();
			int roll2 = rollDie();
			if (roll1 == roll2) {
				++current.doublesCounter;
				

			}
			
			int totalRoll = roll1 + roll2;
			String rollResult = String.format("%s rolled a %d!", current.getName(), totalRoll);
			
			/**
			 * These lines don't work. We can't move the player for some reason.
			 */
			
			for (int i = 0; i <= totalRoll; i++) {
				App.pieces[getCurrentID()].setX(App.spaces[position].getX());
				App.pieces[getCurrentID()].setY(App.spaces[position].getY());
				current.lastPosition = current.position;
				current.position += 1 % 40;
				if(current.lastPosition > current.position) {

					setValue(200);
					/** 
					 * Code to say "pass go, collect $200
					 */
				}
			}
			
			//checks to see if the space landed on is a Property
			if (App.spaceArr[position] instanceof  Property) {

				

				if((((Property) App.spaceArr[position]).getOwnedBy()) == current.getID()) {

					/**
					 * Code to say you already own this, end turn					
					 */
					
				}
				
				else if(((Property) App.spaceArr[position]).getOwnedBy()  == 0) {
					/**
					 * Code to ask if the user wants to buy this
					 * end turn
					 */
				} 
				
				else {
					int owner = ((Property) App.spaceArr[position]).getOwnedBy();
					int value = App.spaceArr[position].getValue();
					

					current.setValue(-value / 10);
				current.setValue(-value / 10);

					setValue(App.players[owner], value / 10);
					/**
					 * Code to say the user owed other player money
					 * end turn
					 */
					if (current.getValue() < 0) {
						broke = true;
						setCurrentPlayer();
						
					}
				}
				
			}
			
			//Check to see if the player is on the Jail space
			else if (App.spaceArr[position] instanceof Jail) {
				/** 
				 * Code to say user is visiting Jail
				 * End turn
				 */
				
			}
			
			//Checks to see if the player is on an Event space
			//Will then use the space name to decide what to do.  
			else if (App.spaceArr[position] instanceof Event) {
				
				if(App.spaceArr[position].getName() == "Community Chest" || App.spaceArr[position].getName() == "Chance") {
					String result = ((Event) App.spaceArr[position]).getEvent();
					/**
					 * Code to output result
					 */
					if (((Event) App.spaceArr[position]).getGoodOrBad() == 1) {
						current.setValue(-50);
						
						if (current.getValue() < 0) {
							broke = true;
							setCurrentPlayer();
						
						}

						current.setValue(-50);

					}
					
					else {

						current.setValue(50);

						current.setValue(50);

					}
				} //if for community/chance
				
				else if (App.spaceArr[position].getName() == "Income Tax") {
					/**
					 * Code to say player has to pay tax
					 */
					

					current.setValue(-200);
					
					if (current.getValue() < 0) {
						broke = true;
						setCurrentPlayer();
						
					}
			current.setValue(-200);

				}
				
				else if (App.spaceArr[position].getName() == "Free Parking") {
					/**
					 * Code to say player gets to park for free!
					 */
				}
				
				else if(App.spaceArr[position].getName() == "Go To Jail") {
					inJail = true;
					/**
					 * Code to send player to jail
					 * Code to display that the player is in jail
					 */
					setCurrentPlayer();
					
				}
				
				
			}
			
			if (doublesCounter == 1 || doublesCounter == 2) {
				
			}
			
			else if (doublesCounter == 3) {
				inJail = true;
				/**
				 * Code to say player is in Jail
				 * Move player to jail
				 */
				
				setCurrentPlayer();
				
			}
			else {
				setCurrentPlayer();
				
			}
		}
	}
	
	
	
	//Describes what the player will do in jail,
	//And give the player the option to roll or pay to get out.
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
