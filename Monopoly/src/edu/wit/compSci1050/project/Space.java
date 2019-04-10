package edu.wit.compSci1050.project;


//Extension of Board, does the same thing as board basically.
public interface Space extends Board {

	public String getName();
	public int getPosition();
	public void setPosition(int position);
	public int getValue();
	public void setValue(int n);
	public int getOwnedBy();
	
	

}
