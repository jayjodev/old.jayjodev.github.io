package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReportController {

	@FXML private TableView<ModelTable> table; //Instance variables
	@FXML private Button _backButton;
	@FXML private TableColumn<ModelTable, String> col_playerID;
	@FXML private TableColumn<ModelTable, String> col_gameID;
	@FXML private TableColumn<ModelTable, String> col_player;
	@FXML private TableColumn<ModelTable, String> col_game;
	@FXML private TableColumn<ModelTable, String> col_score;
	@FXML private TableColumn<ModelTable, String> col_date;
	@FXML private TextField _searchID;
	Connection _connection = null;


	/* Pull all the information from the database of the specified user by ID.
	 *
	 */
	public void onSearchClicked(ActionEvent event){
		this._connection = DBConnection.getConnection();
		int id = Integer.parseInt(this._searchID.getText());


		try {
			//Represent the Player information.
			ResultSet playerResult = this._connection.createStatement().executeQuery
					(String.format("SELECT * FROM PLAYER WHERE PLAYER_ID = %d ", id));

			//Represent the PlayerAndGame information.
			ResultSet playerGameResult = this._connection.createStatement().executeQuery
					(String.format("SELECT * FROM PLAYERANDGAME WHERE PLAYER_ID = %d", id));

			//Get the game information using the player id and Sub query.
			ResultSet gameResult = this._connection.createStatement().executeQuery
					(String.format("SELECT * FROM game WHERE game_id = "
							+ "(SELECT GAME_ID FROM PLAYERANDGAME WHERE PLAYER_ID = %d)", id));

			if(gameResult.next() && playerResult.next() && playerGameResult.next()){
				ObservableList<ModelTable> playerData = FXCollections.observableArrayList();
				playerData.add(new ModelTable(playerResult.getString("player_id"),
						gameResult.getString("game_id"), playerResult.getString("first_name"),
						playerResult.getString("last_name"),
						gameResult.getString("game_title"),
						playerGameResult.getString("score"), playerGameResult.getString("playing_date")));
				table.setItems(playerData);
			}

			else{
				Alert alert =  new Alert(AlertType.INFORMATION, "Player information not found!");
				alert.showAndWait();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBConnection.closeConnection();
		}
	}

	public void onBackClicked(ActionEvent event) throws IOException {
		MainController mainController = new MainController();
		this._backButton.getScene().setRoot(mainController.getMainScene(event));
	}

	@FXML public void initialize(){
		ObservableList<ModelTable> data = FXCollections.observableArrayList(); //Represent each objects from database.

		try {
			this._connection = DBConnection.getConnection();
			ResultSet gameResult = this._connection.createStatement().executeQuery("SELECT * FROM GAME"); //Get all value of the game table
			ResultSet playerResult = this._connection.createStatement().executeQuery("SELECT * FROM PLAYER");  //Get all value of the player table
			ResultSet playerGameResult = this._connection.createStatement().executeQuery("SELECT * FROM PLAYERANDGAME");  //Get all value of the playergame table


			while(gameResult.next() && playerResult.next() && playerGameResult.next()){ //Check new values until there are no value

				data.add(new ModelTable(playerResult.getString("player_id"),
						gameResult.getString("game_id"), playerResult.getString("first_name"),
						playerResult.getString("last_name"),
						gameResult.getString("game_title"),
						playerGameResult.getString("score"), playerGameResult.getString("playing_date")));

				col_playerID.setCellValueFactory(new PropertyValueFactory<>("_playerID"));
				col_gameID.setCellValueFactory(new PropertyValueFactory<>("_gameID"));
				col_player.setCellValueFactory(new PropertyValueFactory<>("_fullName"));
				col_game.setCellValueFactory(new PropertyValueFactory<>("_gameTitle"));
				col_score.setCellValueFactory(new PropertyValueFactory<>("_score"));
				col_date.setCellValueFactory(new PropertyValueFactory<>("_date"));
				table.setItems(data);
			}

		}

		catch (SQLException e){
			e.printStackTrace();
		}

		finally{
			DBConnection.closeConnection();
		}

	}

}






