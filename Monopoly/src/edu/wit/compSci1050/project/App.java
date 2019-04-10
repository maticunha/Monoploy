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
	
	//Everything in the XFML created
	@FXML
	public  TextField DiceResult; 
	
	@FXML
	public static ImageView CPlus; 
	
	@FXML
	public Button Roll; 
	
	@FXML
	public  ScrollPane GameLog; 
	
	@FXML
	public Text Log; 
	
	@FXML
	public static  ImageView Player1; 
	
	@FXML
	public static  ImageView Player2; 
	
	@FXML
	public  static  ImageView Player3; 
	
	@FXML 
	public  static ImageView Go;
	
	@FXML 
	public  static ImageView Assembly; 
	
	@FXML
	public  static ImageView CommunityChest;
	
	@FXML
	public  static ImageView CommunityChest2; 
	
	@FXML
	public  static ImageView CommunityChest3; 
	
	@FXML
	public  static ImageView Perl;
	
	@FXML
	public  static ImageView JavaScript; 
	
	@FXML
	public  static ImageView Question;
	
	@FXML
	public  static ImageView Question2; 
	
	@FXML
	public  static ImageView Question3;
	
	@FXML
	public  static ImageView Question4; 
	
	@FXML
	public  static ImageView HTML5; 
	
	@FXML
	public  static ImageView Tax;
	
	@FXML
	public  static ImageView Java; 
	
	@FXML
	public  static ImageView Scratch;
	
	@FXML
	public  static ImageView Jail;
	
	@FXML
	public  static ImageView Ruby; 
	
	@FXML
	public  static ImageView Chrome;
	
	@FXML
	public  static ImageView Scala;
	
	@FXML
	public  static ImageView JSON;
	
	@FXML
	public  static ImageView Python; 
	
	@FXML
	public  static ImageView VB; 
	
	@FXML
	public  static ImageView FireFox;
	
	@FXML
	public  static ImageView OpenGL;
	
	@FXML
	public  static ImageView FreeParking; 
	
	@FXML
	public  static ImageView PHP;
	
	@FXML
	public  static ImageView Lua; 
	
	@FXML
	public  static ImageView InternetExplorer; 
	
	@FXML
	public  static ImageView R; 
	

	
	@FXML
	public  static ImageView Windows; 
	
	@FXML
	public  static ImageView PowerShell; 
	
	@FXML
	public  static ImageView GoToJail;
	
	@FXML
	public  static ImageView MATLAB; 
	
	@FXML
	public  static ImageView Razer; 
	
	@FXML
	public  static ImageView Delphi; 
	
	@FXML
	public  static ImageView Eclipse; 
	
	@FXML
	public  static ImageView Swift; 
	
	@FXML
	public  static ImageView CSharp; 
	
	@FXML
	public  static ImageView OBJC; 
	
	//Putting them in an array to help in moving
	public static ImageView[] spaces = { 
		Go, Assembly, CommunityChest, Perl, JavaScript, Question, HTML5, Tax, Java, 
		Scratch, Jail, Ruby, Scala, JSON, Question2, Python, VB, FireFox, OpenGL, 
		FreeParking, PHP, Lua, InternetExplorer, R, CommunityChest2, Question3, CPlus, 
		Windows, PowerShell, GoToJail, MATLAB, Razer, Delphi, Eclipse, Question4, 
		Swift, CommunityChest3, CSharp, OBJC
	};
	
	//Player pieces
	public static ImageView[] pieces = {
		Player1, Player2, Player3	
	};
	
	public static void main (String[] args) {
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
					Player.currentPlayer.doTurn(Player.currentPlayer);
					
				}

				
		});
				
	}
	
}


