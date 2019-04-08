package edu.wit.compSci1050.project;

public interface Board {

	
	public Space[] spaceArr= {

		new Property("Test Property", 1, 200),
		new Event("Test Event", 2, 50),
		new Jail("Jail", 9, 50)
	};
	
	public Player[] playerArr = {
		new Player("Player 1", 5000, 1, 0, false),
		new Player("Player 2", 5000, 2, 0, false),
		new Player("Player 3", 5000, 3, 0, false),
	String name;
	int position;
	int value; 
	
	public Board(String name, int position, int value) {
		this.name = name;
		this.position = position;
		this.value = value;
	}
	
	public String getName() {
		
	}
	
	public int getPosition() {
		
	}
	
	public void setPosition(int position) {
		
	}
	
	public int getValue() {
		
	}
	public void setValue(int n) {
		
	}
}
