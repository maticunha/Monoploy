package edu.wit.compSci1050.project;
//comments
public interface Space extends Board {

	public String getName();
	public int getPosition();
	public void setPosition(int position);
	public int getValue();
	public void setValue(int n);
	public int getOwnedBy();
	
	

}
