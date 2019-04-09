package edu.wit.compSci1050.project;
//comments
import java.util.Random;

public class Event implements Space {
	int position;
	String name;
	
	
	String[] eventArrBad = 
		{
		"TypeMismatchException: Lose $50!",
		 "Made a class abstract when it should have been an interface: Lose $50!",
		 "Inheritance class had constructors: Lose $50!",
		 "Tried to make an object of an abstract class: Lose $50!",
		 "Failed the JUnit tests: Lose $50!",
		 "Forgot to push updates to your file: Lose $50!",
		 "Forgot to renew Eagle's security liscence: Lose $50!",
		 "Wasted memory by using an double when an int would do: Lose $50!",
		 "Your comments don't make sense: Lose $50!",
		 "Created a GUI that is unpleasing to the user: Lose $50!"
		};
	
	String[] eventArrGood = 
		{
		 "Succesfully debugged code: Gain $50!",
		 "Implimented polymorphism correctly: Gain $50!",
		 "You gained a full understanding of static classes: Gain $50!",
		 "Got a perfect score on your Computer Science exam: Gain $50!",
		 "Created a GUI that is pleasant to the user: Gain $50!",
		 "Didn't use Chegg to get the code: Gain $50!",
		 "Passed the JUnits test: Gain $50!",
		 "Helped someone with their question on StackOverflow: Gain $50!",
		 "Succesfully made an object oriented program: Gain $50!",
		 "Decided to major in Computer Science: Gain $50!"
		};
	
	int goodOrBad = 0;
	
	public Event(String name, int position) {
		this.name = name;
		this.position = position;
	}
	
	private void setGoodOrBad() {
		Random seed = new Random();
		goodOrBad = seed.nextInt(2) + 1;
		
	}
	
	public int getGoodOrBad() {
		return goodOrBad;
	}
	
	public String getEvent() {
		setGoodOrBad();
		int type = getGoodOrBad();
		
		if (type == 1) {
			Random seed = new Random();
			return eventArrBad[seed.nextInt(10)];
		}
		else {
			Random seed = new Random();
			return eventArrGood[seed.nextInt(10)];
		}
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return position;
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
