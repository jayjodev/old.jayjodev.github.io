package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class UpdatePlayerController {
	@FXML private Button _backButton; //Instance variables

	@FXML TextField _searchID;
	@FXML TextField _newName;
	@FXML TextField _newLast;
	@FXML TextField _newAddress;
	@FXML TextField _newPostalCode;
	@FXML TextField _newProvince;
	@FXML TextField _newPhone;

	@FXML Label _id;
	@FXML Label _firstName;
	@FXML Label _lastName;
	@FXML Label _address;
	@FXML Label _postalCode;
	@FXML Label _province;
	@FXML Label _phoneNumber;
	Connection _connection = null;


	public void onBackClicked(ActionEvent event) throws IOException { //Action when back button is clicked
		MainController mainController = new MainController();
		this._backButton.getScene().setRoot(mainController.getMainScene(event));
	}


	public void onSaveClicked(ActionEvent event){ //Action when Save button is clicked
		this._connection = DBConnection.getConnection();

		try {
			this._connection.createStatement().executeUpdate(
					String.format("UPDATE PLAYER SET FIRST_NAME = '%s', LAST_NAME = '%s', "
							+ " ADDRESS = '%s', POSTAL_CODE = '%s', PROVINCE = '%s',"
							+ " PHONE_NUMBER = '%s' WHERE PLAYER_ID = %d",
							this._newName.getText(),
							this._newLast.getText(),
							this._newAddress.getText(),
							this._newPostalCode.getText(),
							this._newProvince.getText(),
							this._newPhone.getText(),
							Integer.parseInt(this._id.getText())));
			this._connection.commit();
			Alert alert =  new Alert(AlertType.INFORMATION, "Player updated!");
			alert.showAndWait();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DBConnection.closeConnection();
		}
	}

	public void onSearchClicked(ActionEvent event){ //Action when Search button is clicked
		this._connection = DBConnection.getConnection();
		int id = Integer.parseInt(this._searchID.getText());

		try {
			ResultSet player = this._connection.createStatement().executeQuery(
					String.format("SELECT * FROM PLAYER WHERE PLAYER_ID = %d", id));
			this._connection.commit();

			if(player.next()){

				this._id.setText(player.getString("player_id"));
				this._firstName.setText(player.getString("first_name"));
				this._lastName.setText(player.getString("last_name"));
				this._address.setText(player.getString("address"));
				this._postalCode.setText(player.getString("postal_code"));
				this._province.setText(player.getString("province"));
				this._phoneNumber.setText(player.getString("phone_number"));

				//ENABLE TO EDIT THE SEARCH INFORMATION
				this._newName.setText(this._firstName.getText());
				this._newLast.setText(this._lastName.getText());
				this._newAddress.setText(this._address.getText());
				this._newPostalCode.setText(this._postalCode.getText());
				this._newProvince.setText(this._province.getText());
				this._newPhone.setText(this._phoneNumber.getText());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBConnection.closeConnection();
		}
	}
}


