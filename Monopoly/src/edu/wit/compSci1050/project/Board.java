package edu.wit.compSci1050.project;
//comments
public interface Board {

	//Interface that has methods that will be used by all sub-classes

	//comment to push
	public String getName();
	public int getPosition();
	public void setPosition(int position);
	public int getValue();
	public void setValue(int n);
	int getOwnedBy();
	int rollDie();
	
	
	
}
