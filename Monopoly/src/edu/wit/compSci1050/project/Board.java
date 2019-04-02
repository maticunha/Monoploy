package edu.wit.compSci1050.project;

public class Board {

	
	public Board[] boardObjects = {
		new Player("Player 1", 5000, 1, 0, false),
		new Player("Player 2", 5000, 2, 0, false),
		new Player("Player 3", 5000, 3, 0, false),
		new Property("Test Property", 1, 200),
		new Event("Test Event", 2, 50),
		new Jail("Jail", 9, 50)
	};
	//testing to push
	String name;
	int position;
	int value; 
	
	public Board(String name, int position, int value) {
		this.name = name;
		this.position = position;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int n) {
		value += n;
	}
}
