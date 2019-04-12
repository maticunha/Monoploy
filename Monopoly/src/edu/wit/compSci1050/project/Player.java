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
		this.ID = ID;
		this.position = position;
		this.inJail = inJail;
		
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
		currentPlayer = App.players[currentID];
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
		return position; 
	}

	@Override
	public void setPosition(int position) {
		// TODO Auto-generated method stub
		position += position % 39; 
	}

	@Override
	public int getOwnedBy() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public String doTurn(Player current) {
		//checks if player has negative money
		/**
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
			/**
			 * 
			 
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
				//}
			//}
			
			//checks to see if the space landed on is a Property
			if (App.spaceArr[position] instanceof  Property) {

				

				if((((Property) App.spaceArr[position]).getOwnedBy()) == currentID) {

					return("Already own this property, next turn!");
					
				}
				
				else if(((Property) App.spaceArr[position]).getOwnedBy()  == -1) {
					int value = App.spaceArr[position].getValue();
						
						if  (value > current.getValue()){
							return ("Not enough money to buy!");
						}
						
						else {
							((Property) App.spaceArr[position]).setOwnedBy(currentID); 
							current.setValue(- ((Property) App.spaceArr[position]).getValue());
							return String.format("%s bought %s for $%d", current.getName(), ((Property) App.spaceArr[position]).getName(), App.spaceArr[position].getValue());
						}
					
				} 
				
				else {
					int owner = ((Property) App.spaceArr[position]).getOwnedBy();
					int value = App.spaceArr[position].getValue();
					

					current.setValue(-value / 10);

					setValue(App.players[owner], value / 10);
					
					
					if (current.getValue() < 0) {
						current.broke = true;
						
						return String.format("%s is Bankrupt!", current.getName());
						
					}
					
					return String.format("%s paid %s $%d for rent at %s!", current.getName(), (App.players[owner].getName()), value/10, ((Property) App.spaceArr[position]).getName());
				}
				
			}
			
			//Check to see if the player is on the Jail space
			else if (App.spaceArr[position] instanceof Jail) {
				return String.format("%s is visiting Jail!", current.getName());
				
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
							setCurrentID(); 
							setCurrentPlayer();
							return String.format("%s's card: %s%n %s is Bankrupt!", current.getName(), result, current.getName());
						}

						

					}
					
					else {

						current.setValue(50);
					}
					
					return String.format("%s's card: %s", current.getName(), result);
				} //if for community/chance
				
				else if (App.spaceArr[position].getName() == "Income Tax") {
					
					
					

					current.setValue(-200);
					
					if (current.getValue() < 0) {
						broke = true;
						return String.format("%s paid $200 in income tax.%n %s is bankrupt!", current.getName(), current.getName());
						
					}
					return String.format("%s paid $200 in income tax.", current.getName());

				}
				
				else if (App.spaceArr[position].getName() == "Free Parking") {
					
					return String.format("%s parked for free!", current.getName());
				}
				
				else if(App.spaceArr[position].getName() == "Go To Jail") {
					current.inJail = true;
					++current.jailCounter;
					return String.format("%s is in jail!", current.getName());
					
					
				}
				
				
			}
			
//			if (doublesCounter == 1 || doublesCounter == 2) {
//				
//			}
//			
//			else if (doublesCounter == 3) {
//				inJail = true;
//				/**
//				 * Code to say player is in Jail
//				 * Move player to jail
//				 */
//				setCurrentID();
//				setCurrentPlayer();
//				
//			}
//			else {
//				setCurrentID();
//				setCurrentPlayer();
//				
//			}
			
			return "";
		}
	
	
	
	
	//Describes what the player will do in jail,
	//And give the player the option to roll or pay to get out.
	public String doJail(Player current) {
		int roll1 = rollDie();
		int roll2 = rollDie();
		
		if (current.jailCounter == 1 || current.jailCounter == 2) {
			
			if(roll1 == roll2) {
				current.inJail = false;
				current.jailCounter = 0;
				return String.format("%s has brkoen out of jail! Now commencing turn", current.getName());
				
			}
			else {
				++current.jailCounter;
				return String.format("%s in still in jail!", current.getName());
			}
		}
		else if (current.jailCounter == 3) {
			
			if (roll1 == roll2) {
				current.inJail = false;
				current.jailCounter = 0;
				return String.format("%s has brkoen out of jail! Now commencing turn", current.getName());
			}
			else {
				inJail = false;
				current.jailCounter = 0;
				return String.format("%s failed to break out! Pay $50 bail, then continue turn", current.getName());
			}
		}
		
		return "";
	}



}
