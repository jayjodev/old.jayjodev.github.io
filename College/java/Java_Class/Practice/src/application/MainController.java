
package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

	@FXML TextField _userId;
	@FXML TextField _firstName;
	@FXML TextField _lastName;
	@FXML TextField _testTitle;

	@FXML TextField _searchID;
	@FXML TextField _updateuserId;
	@FXML TextField _updatefirstName;
	@FXML TextField _updatelastName;
	@FXML TextField _updatetestTitle;

	@FXML private TableView<Model> table; //Instance variables
	@FXML private Button _backButton;
	@FXML private TableColumn<Model, String> table_title;
	@FXML private TableColumn<Model, String> table_Id;
	@FXML private TableColumn<Model, String> table_FirstName;
	@FXML private TableColumn<Model, String> table_LastName;


	Connection _connection = null;

	public void onSaveClicked(ActionEvent event){
		Statement stmt = null;

		// Insert Value
		try{


			this._connection = DBConnection.getConnection();
			stmt = this._connection.createStatement();
			int userId = Integer.parseInt(this._userId.getText());
			String firstName = this._firstName.getText();
			String lastName = this._lastName.getText();
			String TestTitle = this._testTitle.getText();

			System.out.println("--INSERTING VALUES INTO Test TABLE--");
			stmt.executeUpdate(String.format("INSERT INTO Test(userid, firstname, lastname, TestTitle)"
					+ "VALUES (%d,'%s', '%s', '%s')",userId, firstName,lastName, TestTitle ));
			System.out.println("--DONE--");

			this._connection.commit();
			Alert alert =  new Alert(AlertType.INFORMATION, "Test information added");
			alert.showAndWait();

			initialize();


		}
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
		finally{
			if(this._connection != null){
				DBConnection.closeConnection();
			}
		}
	}

	public void onSearchClicked(ActionEvent event){ //Action when Search button is clicked
		this._connection = DBConnection.getConnection();
		int _id = Integer.parseInt(this._searchID.getText());

		try {
			ResultSet test = this._connection.createStatement().executeQuery(
					String.format("SELECT * FROM test WHERE userid = %d", _id));

			this._connection.commit();

			if(test.next()){

				this._updatefirstName.setText(test.getString("firstname"));
				this._updatelastName.setText(test.getString("lastname"));
				this._updatetestTitle.setText(test.getString("testtitle"));
				this._updateuserId.setText(test.getString("userid"));

				//ENABLE TO EDIT THE SEARCH INFORMATION
				this._updatefirstName.setText(this._updatefirstName.getText());
				this._updatelastName.setText(this._updatelastName.getText());
				this._updatetestTitle.setText(this._updatetestTitle.getText());
				this._updateuserId.setText(this._updateuserId.getText());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBConnection.closeConnection();
		}
	}
	public void onDeleteClicked(ActionEvent event){ //Action when Save button is clicked
		this._connection = DBConnection.getConnection();

		try {

			this._connection.createStatement().executeQuery(
					String.format("delete from test WHERE userid = %d",
							Integer.parseInt(this._updateuserId.getText())));

			this._connection.commit();
			Alert alert =  new Alert(AlertType.INFORMATION, "test Delete!");
			alert.showAndWait();

			initialize();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DBConnection.closeConnection();
		}
	}

	public void onUpdateClicked(ActionEvent event){ //Action when Save button is clicked
		this._connection = DBConnection.getConnection();

		try {
			this._connection.createStatement().executeUpdate(
					String.format("UPDATE test SET firstname = '%s',lastname ='%s', testtitle='%s' WHERE userid = %d",
							this._updatefirstName.getText(),
							this._updatelastName.getText(),
							this._updatetestTitle.getText(),
							Integer.parseInt(this._updateuserId.getText())));

			this._connection.commit();
			Alert alert =  new Alert(AlertType.INFORMATION, "test updated!");
			alert.showAndWait();

			initialize();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DBConnection.closeConnection();
		}
	}


	@FXML public void initialize(){
		ObservableList<Model> data = FXCollections.observableArrayList(); //Represent each objects from database.

		try {
			this._connection = DBConnection.getConnection();
			ResultSet test = this._connection.createStatement().executeQuery("SELECT * FROM test"); //Get all value of the game table
			//ResultSet playerResult = this._connection.createStatement().executeQuery("SELECT * FROM PLAYER");  //Get all value of the player table
			//ResultSet playerGameResult = this._connection.createStatement().executeQuery("SELECT * FROM PLAYERANDGAME");  //Get all value of the playergame table


			while(test.next()){ //Check new values until there are no value

				data.add(new Model(test.getString("testtitle"),
						test.getString("userid"), test.getString("firstname"),
						test.getString("lastname")));


				table_title.setCellValueFactory(new PropertyValueFactory<>("_testtitle"));
				table_Id.setCellValueFactory(new PropertyValueFactory<>("_id"));
				table_FirstName.setCellValueFactory(new PropertyValueFactory<>("_firstName"));
				table_LastName.setCellValueFactory(new PropertyValueFactory<>("_lastName"));
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