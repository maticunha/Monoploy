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

public class App extends Application implements Initializable {
	public static String player1_name = "Player 1";
	public static String player2_name = "Player 2";
	public static String player3_name = "Player 3";
	
	
	
	//This is where the text for the log is initialized. 
	@FXML
	public static TextField DiceResult; 
	
	
	@FXML
	public static Button Roll; 
	
	@FXML
	public static ScrollPane GameLog; 
	
	@FXML
	public Text Log; 
	
	@FXML
	public static ImageView Player1; 
	
	@FXML
	public static ImageView Player2; 
	
	@FXML
	public static ImageView Player3; 
	
	@FXML 
	public static ImageView Go;
	
	@FXML 
	public static ImageView Assembly; 
	
	@FXML
	public static ImageView CommunityChest;
	
	@FXML
	public static ImageView CommunityChest2; 
	
	@FXML
	public static ImageView CommunityChest3; 
	
	@FXML
	public static ImageView Perl;
	
	@FXML
	public static ImageView JavaScript; 
	
	@FXML
	public static ImageView Question;
	
	@FXML
	public static ImageView Question2; 
	
	@FXML
	public static ImageView Question3;
	
	@FXML
	public static ImageView Question4; 
	
	@FXML
	public static ImageView HTML5; 
	
	@FXML
	public static ImageView Tax;
	
	@FXML
	public static ImageView Java; 
	
	@FXML
	public static ImageView Scratch;
	
	@FXML
	public static ImageView Jail;
	
	@FXML
	public static ImageView Ruby; 
	
	@FXML
	public static ImageView Chrome;
	
	@FXML
	public static ImageView Scala;
	
	@FXML
	public static ImageView JSON;
	
	@FXML
	public static ImageView Python; 
	
	@FXML
	public static ImageView VB; 
	
	@FXML
	public static ImageView FireFox;
	
	@FXML
	public static ImageView OpenGL;
	
	@FXML
	public static ImageView FreeParking; 
	
	@FXML
	public static ImageView PHP;
	
	@FXML
	public static ImageView Lua; 
	
	@FXML
	public static ImageView InternetExplorer; 
	
	@FXML
	public static ImageView R; 
	
	@FXML
	public static ImageView CPlus;
	
	@FXML
	public static ImageView Windows; 
	
	@FXML
	public static ImageView PowerShell; 
	
	@FXML
	public static ImageView GoToJail;
	
	@FXML
	public static ImageView MATLAB; 
	
	@FXML
	public static ImageView Razer; 
	
	@FXML
	public static ImageView Delphi; 
	
	@FXML
	public static ImageView Eclipse; 
	
	@FXML
	public static ImageView Swift; 
	
	@FXML
	public static ImageView CSharp; 
	
	@FXML
	public static ImageView OBJC; 
	
	public static ImageView[] spaces = { 
		Go, Assembly, CommunityChest, Perl, JavaScript, Question, HTML5, Tax, Java, 
		Scratch, Jail, Ruby, Scala, JSON, Question2, Python, VB, FireFox, OpenGL, 
		FreeParking, PHP, Lua, InternetExplorer, R, CommunityChest2, Question3, CPlus,
		Windows, PowerShell, GoToJail, MATLAB, Razer, Delphi, Eclipse, Question4, 
		Swift, CommunityChest3, CSharp, OBJC
	};
	
	public static ImageView[] pieces = {
		Player1, Player2, Player3	
	};
	
	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("Board.fxml"));
		final Pane p = loader.load();
		arg0.setTitle("Monopoly Computer Science Edition");
		arg0.setScene(new Scene(p));
		arg0.show();
	}

		
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			Log.setText(Log.getText() + " Memes!");
		}
				
	}


