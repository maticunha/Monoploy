package edu.wit.compSci1050.project;

public interface Board {

	

	public static Player[] players = {
		new Player("Player 1", 5000, 1, 0, false),
		new Player("Player 2", 5000, 2, 0, false),
		new Player("Player 3", 5000, 3, 0, false),
	};

	
	public static Space[] spaceArr = {
		new Property("Test Property", 50, 1),
		new Jail("Jail", 9),
		new Event("Go", 0)
	};

	
	public String getName();
	public int getPosition();
	public void setPosition(int position);
	public int getValue();
	public void setValue(int n);
	
	
	
}
