package edu.wit.compSci1050.project;

public class Board {

	
	public Board[] boardObjects = {
		new Player("Player 1", 5000, 1, 0, false),
		new Player("Player 2", 5000, 2, 0, false),
		new Player("Player 3", 5000, 3, 0, false)
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
