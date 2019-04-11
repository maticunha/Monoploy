package edu.wit.compSci1050.project;
//comment to push

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle; 

public class App extends Application implements Initializable {
	public static String player1_name = "Player 1";
	public static String player2_name = "Player 2";
	public static String player3_name = "Player 3";
	
	
	//All of the player created
	public static Player[] players = {
			new Player(App.player1_name, 5000, 0, 0, false),
			new Player(App.player2_name, 5000, 0, 1, false),
			new Player(App.player3_name, 5000, 0, 2, false),
		};

	//All the spaces created
	public static  Space[] spaceArr = {
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
	
	//Everything in the FXML created
	
	
	@FXML
	public  TextField DiceResult; 
	
	@FXML
	public static ImageView CPlus = new ImageView(); 
	
	@FXML
	public Button Roll; 
	
	@FXML
	public  ScrollPane GameLog; 
	
	@FXML
	public Text Log; 
	
	@FXML
	public static  Circle Player1 = new Circle(); 
	
	@FXML
	public static  Circle Player2 = new Circle(); 
	
	@FXML
	public  static  Circle Player3 = new Circle(); 
	
	@FXML 
	public  static ImageView Go = new ImageView();
	
	
	@FXML 
	public  static ImageView Assembly = new ImageView(); 
	
	@FXML
	public  static ImageView CommunityChest= new ImageView();
	
	@FXML
	public  static ImageView CommunityChest2= new ImageView(); 
	
	@FXML
	public  static ImageView CommunityChest3= new ImageView();
	
	@FXML
	public  static ImageView Perl= new ImageView();
	
	@FXML
	public  static ImageView JavaScript= new ImageView(); 
	
	@FXML
	public  static ImageView Question= new ImageView();
	
	@FXML
	public  static ImageView Question2= new ImageView();
	
	@FXML
	public  static ImageView Question3= new ImageView();
	
	@FXML
	public  static ImageView Question4= new ImageView();
	
	@FXML
	public  static ImageView HTML5= new ImageView(); 
	
	@FXML
	public  static ImageView Tax= new ImageView();
	
	@FXML
	public  static ImageView Java= new ImageView();
	
	@FXML
	public  static ImageView Scratch= new ImageView();
	
	@FXML
	public  static ImageView Jail= new ImageView();
	
	@FXML
	public  static ImageView Ruby= new ImageView();
	
	@FXML
	public  static ImageView Chrome= new ImageView();
	
	@FXML
	public  static ImageView Scala= new ImageView();
	
	@FXML
	public  static ImageView JSON= new ImageView();
	
	@FXML
	public  static ImageView Python= new ImageView();
	
	@FXML
	public  static ImageView VB= new ImageView();
	
	@FXML
	public  static ImageView FireFox= new ImageView();
	
	@FXML
	public  static ImageView OpenGL= new ImageView();
	
	@FXML
	public  static ImageView FreeParking= new ImageView(); 
	
	@FXML
	public  static ImageView PHP= new ImageView();
	
	@FXML
	public  static ImageView Lua= new ImageView(); 
	
	@FXML
	public  static ImageView InternetExplorer= new ImageView(); 
	
	@FXML
	public  static ImageView R= new ImageView(); 
	
	@FXML
	public  static ImageView Windows= new ImageView();
	
	@FXML
	public  static ImageView PowerShell= new ImageView();
	
	@FXML
	public  static ImageView GoToJail= new ImageView();
	
	@FXML
	public  static ImageView MATLAB= new ImageView();
	
	@FXML
	public  static ImageView Razer= new ImageView();
	
	@FXML
	public  static ImageView Delphi= new ImageView(); 
	
	@FXML
	public  static ImageView Eclipse= new ImageView(); 
	
	@FXML
	public  static ImageView Swift= new ImageView();
	
	@FXML
	public  static ImageView CSharp= new ImageView(); 
	
	@FXML
	public  static ImageView OBJC= new ImageView(); 
	
	
	//Putting them in an array to help in moving
	public static ImageView[] spaces = { 
		Go, Assembly, CommunityChest, Perl, JavaScript, Question, HTML5, Tax, Java, 
		Scratch, Jail, Ruby, Chrome, Scala, JSON, Question2, Python, VB, FireFox, OpenGL, 
		FreeParking, PHP, Lua, InternetExplorer, R, CommunityChest2, Question3, CPlus, 
		Windows, PowerShell, GoToJail, MATLAB, Razer, Delphi, Eclipse, Question4, 
		Swift, CommunityChest3, CSharp, OBJC
	};
	
	//Player pieces
	public static Circle[] pieces = {
		Player1, Player2, Player3	
	};
	
	public static void main (String[] args) {
		
		Go.setX(867);
		Go.setY(862);
		Assembly.setX(788);
		Assembly.setY(929);
		CommunityChest.setX(707);
		CommunityChest.setY(891);
		Perl.setX(629);
		Perl.setY(913);
		JavaScript.setX(540);
		JavaScript.setY(896);
		Question.setX(465);
		Question.setY(857);
		HTML5.setX(390);
		HTML5.setY(915); 
		Tax.setX(310); 
		Tax.setY(900);
		Java.setX(226);
		Java.setY(912);
		Scratch.setX(146);
		Scratch.setX(912);
		Jail.setX(8);
		Jail.setY(864);
		Ruby.setX(24);
		Ruby.setY(781);
		Chrome.setX(30);
		Chrome.setY(717);
		Scala.setX(26);
		Scala.setY(640);
		JSON.setX(9);
		JSON.setY(546);
		Question2.setX(42);
		Question2.setY(425);
		Python.setX(18); 
		Python.setY(386);
		VB.setX(21);
		VB.setY(302);
		FireFox.setX(19);
		FireFox.setY(224);
		OpenGL.setX(25);
		OpenGL.setY(147); 
		FreeParking.setX(2);
		FreeParking.setY(1);
		PHP.setX(146); 
		PHP.setY(4);
		Lua.setX(227);
		Lua.setY(6);
		InternetExplorer.setX(315);
		InternetExplorer.setY(29);
		R.setX(394);
		R.setY(25);
		CommunityChest2.setX(465);
		CommunityChest2.setY(3);
		Question3.setX(546);
		Question3.setY(3);
		CPlus.setX(633);
		CPlus.setY(11);
		Windows.setX(714); 
		Windows.setY(12);
		PowerShell.setX(792);
		PowerShell.setY(6);
		GoToJail.setX(869);
		GoToJail.setY(2);
		MATLAB.setX(905);
		MATLAB.setY(153);
		Razer.setX(918);
		Razer.setY(232);
		Delphi.setX(900);
		Delphi.setY(321);
		Eclipse.setX(917);
		Eclipse.setY(396);
		Question4.setX(904);
		Question4.setY(433);
		Swift.setX(919);
		Swift.setY(570); 
		CommunityChest3.setX(898);
		CommunityChest3.setY(600);
		CSharp.setX(916);
		CSharp.setY(713);
		OBJC.setX(917); 
		OBJC.setY(794);
		
		launch(args);
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/wit/compSci1050/project/Board.fxml"));
		final Pane p = loader.load();
		arg0.setTitle("Monopoly Computer Science Edition");
		arg0.setScene(new Scene(p));
		arg0.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Player.currentPlayer=players[0];
			Roll.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					int roll1 = 0;
					int roll2 = 0;
					if (Player.currentPlayer.broke) {
						Player.setCurrentID();
						Player.setCurrentPlayer();
						
					}
					//checks to see if player is in jail
					else if (Player.currentPlayer.inJail) {

						Player.currentPlayer.doJail();
					}
					else {
						roll1 = Player.currentPlayer.rollDie();
						roll2 = Player.currentPlayer.rollDie();
						if (roll1 == roll2) {
							++Player.currentPlayer.doublesCounter;
							
						}
					}
						
						int totalRoll = roll1 + roll2;
						String rollResult = String.format("%s rolled a %d!", Player.currentPlayer.getName(), totalRoll);
						
						/**
						 * These lines don't work. We can't move the player for some reason.
						 */
							System.out.println("ID: " + Player.currentID); 					 
						for (int i = 0; i <= totalRoll; i++) {
							if(Player.currentPlayer.getPosition()>=40) {
								Player.currentPlayer.position=Player.currentPlayer.position % 40; 
							}
							pieces[Player.getCurrentID()].setLayoutX(spaces[Player.currentPlayer.position].getLayoutX());
							pieces[Player.getCurrentID()].setLayoutY(spaces[Player.currentPlayer.position].getLayoutY());
							Player.currentPlayer.lastPosition = Player.currentPlayer.position;
							Player.currentPlayer.position += 1;
							pieces[Player.getCurrentID()].setVisible(true); 
							pieces[Player.getCurrentID()].requestFocus();  
							System.out.println(Player.currentPlayer.position);
							if(Player.currentPlayer.lastPosition > Player.currentPlayer.position) {

								Player.currentPlayer.setValue(200);
								/** 
								 * Code to say "pass go, collect $200
								 */
							}
						}
					Player.setCurrentID();
					Player.setCurrentPlayer();
					//Player.currentPlayer.doTurn(Player.currentPlayer);
					
				}

				
				
				
				
			
	});

	
}
}


