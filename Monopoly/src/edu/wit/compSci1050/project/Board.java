package edu.wit.compSci1050.project;

public class Board {

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
