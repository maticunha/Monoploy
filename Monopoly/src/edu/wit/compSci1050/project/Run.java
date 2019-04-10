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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Run extends Application implements Initializable {
	public static String player1_name = "Player 1";
	public static String player2_name = "Player 2";
	public static String player3_name = "Player 3";
	
	
	
	//This is where the text for the log is initialized. 
	@FXML
	TextField DiceResult; 
	
	
	@FXML
	static Button Roll; 
	
	@FXML
	static ScrollPane GameLog; 
	
	@FXML
	static Text Log; 
	
	@FXML
	static ImageView Player1; 
	
	@FXML
	static ImageView Player2; 
	
	@FXML
	static ImageView Player3; 
	
	@FXML 
	static ImageView Go;
	
	@FXML 
	static ImageView Assembly; 
	
	@FXML
	static ImageView CommunityChest;
	
	@FXML
	static ImageView CommunityChest2; 
	
	@FXML
	static ImageView CommunityChest3; 
	
	@FXML
	static ImageView Perl;
	
	@FXML
	static ImageView JavaScript; 
	
	@FXML
	static ImageView Question;
	
	@FXML
	static ImageView Question2; 
	
	@FXML
	static ImageView Question3;
	
	@FXML
	static ImageView Question4; 
	
	@FXML
	static ImageView HTML5; 
	
	@FXML
	static ImageView Tax;
	
	@FXML
	static ImageView Java; 
	
	@FXML
	static ImageView Scratch;
	
	@FXML
	static ImageView Jail;
	
	@FXML
	static ImageView Ruby; 
	
	@FXML
	static ImageView Chrome;
	
	@FXML
	static ImageView Scala;
	
	@FXML
	static ImageView JSON;
	
	@FXML
	static ImageView Python; 
	
	@FXML
	static ImageView VB; 
	
	@FXML
	static ImageView FireFox;
	
	@FXML
	static ImageView OpenGL;
	
	@FXML
	static ImageView FreeParking; 
	
	@FXML
	static ImageView PHP;
	
	@FXML
	static ImageView Lua; 
	
	@FXML
	static ImageView InternetExplorer; 
	
	@FXML
	static ImageView R; 
	
	@FXML
	static ImageView CPlus;
	
	@FXML
	static ImageView Windows; 
	
	@FXML
	static ImageView PowerShell; 
	
	@FXML
	static ImageView GoToJail;
	
	@FXML
	static ImageView MATLAB; 
	
	@FXML
	static ImageView Razer; 
	
	@FXML
	static ImageView Delphi; 
	
	@FXML
	static ImageView Eclipse; 
	
	@FXML
	static ImageView Swift; 
	
	@FXML
	static ImageView CSharp; 
	
	@FXML
	static ImageView OBJC; 
	
	public static ImageView[] spaces = { 
		Go, Assembly, CommunityChest, Perl, JavaScript, Question, HTML5, Tax, Java, 
		Scratch, Jail, Ruby, Scala, JSON, Question2, Python, VB, FireFox, OpenGL, 
		FreeParking, PHP, Lua, InternetExplorer, R, CommunityChest2, Question3, CPlus,
		Windows, PowerShell, GoToJail, MATLAB, Razer, Delphi, Eclipse, Question4, 
		Swift, CommunityChest3, CSharp, OBJC
	};
	
	public static void main (String[] args) {
		Log.setText("Example");
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("Board.fxml"));
		Scene scene = new Scene(root);
		arg0.setTitle("Monopoly Computer Science Edition");
		arg0.setScene(scene);
		arg0.show();
		Log.setText("Example");

		
			}

		
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//comment 
		
		}
				
	}


