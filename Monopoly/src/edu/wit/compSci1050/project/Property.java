package edu.wit.compSci1050.project;

public class Property extends Space {
	int ownedBy;
	
	
	public Property(String name, int position, int value) {
		super(name, position, value);
		
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
	
	public int getOwnedBy() {
		return ownedBy;
	}
	
	public void setOwnedBy(int n) {
		ownedBy = n;
	}

}
