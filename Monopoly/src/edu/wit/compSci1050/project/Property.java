package edu.wit.compSci1050.project;


//Simple method to keep track of each property
public class Property implements Space {
	int ownedBy = -1;
	String name;
	int position;
	int value;
	
	
	public Property(String name, int position, int value) {
		this.name = name;
		this.position = position;
		this.value = value;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setOwnedBy(int n) {
		ownedBy = n;
	}

	@Override
	public void setPosition(int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(int n) {
		// TODO Auto-generated method stub
		
	}

	public int getOwnedBy() {
		// TODO Auto-generated method stub
		return ownedBy;
	}

	@Override
	public int rollDie() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
