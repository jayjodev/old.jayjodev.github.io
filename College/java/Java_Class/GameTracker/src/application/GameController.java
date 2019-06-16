package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class GameController {
	@FXML Button _backButton;  //Instance variables
	@FXML TextField _gameTitle;
	@FXML TextField _firstName;
	@FXML TextField _lastName;
	@FXML TextField _Address;
	@FXML TextField _postalCode;
	@FXML ChoiceBox<String> _province;
	@FXML TextField _phoneNumber;
	@FXML TextField _score;
	Connection _connection = null;

	public void onBackClicked(ActionEvent event) throws IOException { //Action when back button is clicked
		MainController mainController = new MainController();
		this._backButton.getScene().setRoot(mainController.getMainScene(event));
	}

	@FXML public void initialize(){ //Set up province

		ObservableList<String> provinceData = FXCollections.observableArrayList();
		provinceData.addAll("ON", "BC", "QB", "AB", "NB", "NS");
		this._province.setItems(provinceData);
	}

	public void onSaveClicked(ActionEvent event){
		Statement stmt = null;
		PreparedStatement gameSequence;
		PreparedStatement playerSequence;
		PreparedStatement playerGameSequence;

		/* The three ResultSet represent the current ID(PRIMARY KEY) of the last row.
		 * Each time a Game, Player, PlayerGame is created, those values will automatically increase,
		 * so there is no need to specify the ID of each instance.
		 *  */

		ResultSet gs; //Represent a Game primary key generate by a sequence in the database.
		ResultSet ps; //Represent a Player primary key generate by a sequence in the database.
		ResultSet pgs; //Represent a PlayerAndGame primary key generate by a sequence in the database.
		ResultSet exists; //Avoid data redundancy.

		//Represents the primary key
		int gameID;
		int playerID;
		int playerGameID;

		try{
			this._connection = DBConnection.getConnection();
			//Get the next available Primary Key for each table.
			gameSequence = this._connection.prepareStatement("SELECT SEQ_GAME.NEXTVAL FROM DUAL"); //Set primary key of Game table
			playerSequence = this._connection.prepareStatement("SELECT SEQ_PLAYER.NEXTVAL FROM DUAL"); //Set primary key of player table
			playerGameSequence = this._connection.prepareStatement("SELECT SEQ_PLAYER_GAME.NEXTVAL FROM DUAL"); //Set primary key of playerGame table

			//set the next available Primary Key for each table.
			gs = gameSequence.executeQuery();
			ps = playerSequence.executeQuery();
			pgs = playerGameSequence.executeQuery();
			/*Insert values into the database */

			if(gs.next() && ps.next() && pgs.next()){ //If a primary key is available in all the tables, then it will grant to create a game.
				stmt = this._connection.createStatement();
				gameID = gs.getInt(1);
				playerID = ps.getInt(1);
				playerGameID = pgs.getInt(1);

				//Player  Info.
				String firstName = this._firstName.getText();
				String lastName = this._lastName.getText();
				String address = this._Address.getText();
				String postalCode = this._postalCode.getText();
				String province = this._province.getSelectionModel().getSelectedItem().toString();
				String phoneNumber = this._phoneNumber.getText();

				//Game Info
				String gameTitle = this._gameTitle.getText();
				int gameScore = Integer.parseInt(this._score.getText());

				//Validates that the score is not greater than 10, or less than 0
				gameScore = gameScore > 10 ? 10 : gameScore;


				String sql_exists= String.format("select * from game where game_title = '%s'", gameTitle);
				exists=stmt.executeQuery(sql_exists);
				if(!exists.next()){
					//Creates the first player
					System.out.println("--INSERTING VALUES INTO PLAYER TABLE--");
					stmt.executeUpdate(String.format("INSERT INTO PLAYER (PLAYER_ID, FIRST_NAME, LAST_NAME, ADDRESS, POSTAL_CODE, PROVINCE, PHONE_NUMBER) "
							+ "VALUES (%d,'%s', '%s', '%s', '%s', '%s', '%s')", playerID, firstName, lastName, address, postalCode, province, phoneNumber));
					System.out.println("--DONE--");

					//Creates a game
					System.out.println("--INSERTING VALUES INTO GAME TABLE--");
					stmt.executeUpdate(String.format("INSERT INTO GAME (GAME_ID, GAME_TITLE) VALUES (%d,'%s')", gameID, gameTitle));
					System.out.println("--DONE--");

					System.out.println("--INSERTING VALUES INTO PLAYER AND GAME TABLE--");
					//Creates a game which a player played.
					stmt.executeUpdate(String.format("INSERT INTO PLAYERANDGAME(PLAYER_GAME_ID, SCORE,GAME_ID, PLAYER_ID)"
							+ "VALUES (%d, %d, %d, %d)", playerGameID, gameScore, gameID, playerID));
					System.out.println("--DONE--");

					this._connection.commit();
					Alert alert =  new Alert(AlertType.INFORMATION, "Player & Game Information added");
					alert.showAndWait();
				}
				else{
					Alert alert =  new Alert(AlertType.INFORMATION, "This Game is already registered");
					alert.showAndWait();
				}
			}

		}catch(Exception ex){
			System.out.print(ex.getMessage());
		}
		finally{
			if(this._connection != null){
				DBConnection.closeConnection();
			}
		}
	}
}