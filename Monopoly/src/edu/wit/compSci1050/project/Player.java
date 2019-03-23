package edu.wit.compSci1050.project;

public class Player extends Board {
	String name;
	int value;
	int ID;
	int position;

	
	Player(String name,int value, int ID, int position){
		super(name, position, value);
		this.ID = ID;
		
	}
	
	public String getName() {
		return name;
		
	}

	
	public int getID() {
		return ID;
		
	}
	
	

}
