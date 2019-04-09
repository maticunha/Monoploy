package edu.wit.compSci1050.project;
//comments
public interface Board {

	//comment to push

	public static Player[] players = {
		new Player(Run.player1_name, 5000, 0, 0, false),
		new Player(Run.player2_name, 5000, 1, 0, false),
		new Player(Run.player3_name, 5000, 2, 0, false),
	};

	
	public static Space[] spaceArr = {
		new Event("Go", 0),
		new Property("Assembly", 50, 1),
		new Event("Community Chest", 2),
		new Property("Perl", 50, 3),
		new Property("JavaScript", 60, 4),
		new Event("Chance", 5),
		new Property("HTML5", 80, 6),
		new Event("Income Tax", 7),
		new Property("Java", 80, 8),
		new Property("Scratch", 90, 9),
		new Jail("Jail", 10),
		new Property("Ruby", 125, 11),
		new Property("Chrome", 200, 12),
		new Property("Scala", 125, 13),
		new Property("JSon", 135, 14),
		new Event("Chance", 15),
		new Property("Python", 150, 16),
		new Property("VB", 150, 17),
		new Property("Firefox", 200, 18),
		new Property("OpenGL", 160, 19),
		new Event("Free Parking", 20),
		new Property("PHP", 180, 21),
		new Property("Lua", 180, 22),
		new Property("Internet Explorer", 200, 23),
		new Property("R", 200, 24),
		new Event("Community Chest", 25),
		new Event("Chance", 26),
		new Property("C++", 215, 27),
		new Property("Windows", 200, 28),
		new Property("PowerShell", 220, 29),
		new Event("Go To Jail", 30),
		new Property("Matlab", 240, 31),
		new Property("Razer", 200, 32),
		new Property("Delphi", 240, 33),
		new Property("Eclipse", 200, 34),
		new Event("Chance", 35),
		new Property("Swift", 260, 36),
		new Event("Community Chest", 37),
		new Property("C#", 260, 38),
		new Property("Obj-C", 280, 39)
	};

	
	public String getName();
	public int getPosition();
	public void setPosition(int position);
	public int getValue();
	public void setValue(int n);
	int getOwnedBy();
	
	
	
}
