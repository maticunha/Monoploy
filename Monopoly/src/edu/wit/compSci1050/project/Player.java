package edu.wit.compSci1050.project;

public class Player {
	
	private String name;
	
	private int money;
	
	private int playerId;
	
	Player(String name,int money, int iD){
		this.name = name;
		this.money = money;
		this.playerId = iD;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getMoney() {
		return money;
		
	}
	
	public int getPlayerId() {
		return playerId;
		
	}
	
	public void setMoney(int amount) {
		money += amount;
		
	}

}
