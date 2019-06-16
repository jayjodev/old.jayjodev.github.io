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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class InsertController {

	@FXML TextField _userId;
	@FXML TextField _firstName;
	@FXML TextField _lastName;
	@FXML TextField _testTitle;

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
}