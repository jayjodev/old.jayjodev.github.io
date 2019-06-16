
package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

	@FXML TextField _studentId; //variables
	@FXML TextField _firstName;
	@FXML TextField _lastName;
	@FXML TextField _address;
	@FXML TextField _city;
	@FXML TextField _province;
	@FXML TextField _postalcode;

	@FXML TextField _searchID;

	@FXML private TableView<Model> table;

	@FXML private TableColumn<Model, String> table_studentId; //table variables
	@FXML private TableColumn<Model, String> table_firstName;
	@FXML private TableColumn<Model, String> table_lastName;
	@FXML private TableColumn<Model, String> table_address;
	@FXML private TableColumn<Model, String> table_city;
	@FXML private TableColumn<Model, String> table_province;
	@FXML private TableColumn<Model, String> table_postalcode;

	Connection _connection = null;

	public void onSearchClicked(ActionEvent event){ //Action when Search button is clicked

		try {

			this._connection = DBConnection.getConnection();
			String city = this._searchID.getText();
			ObservableList<Model> database = FXCollections.observableArrayList(); //Represent each objects from database.

			ResultSet value = this._connection.createStatement().executeQuery(
					String.format("SELECT * FROM students WHERE address = '%s'", city)); //get the value from database
			this._connection.commit();

			while(value.next()){ //Check new values until there are no value

				database.add(new Model(value.getString("studentId"),
						value.getString("firstname"), value.getString("lastname"),
						value.getString("address"),value.getString("city"),value.getString("province"),value.getString("postalCode")));

				table_studentId.setCellValueFactory(new PropertyValueFactory<>("_mstudentId"));
				table_firstName.setCellValueFactory(new PropertyValueFactory<>("_mid"));
				table_lastName.setCellValueFactory(new PropertyValueFactory<>("_mfirstName"));
				table_address.setCellValueFactory(new PropertyValueFactory<>("_maddress"));
				table_city.setCellValueFactory(new PropertyValueFactory<>("_mlastName"));
				table_province.setCellValueFactory(new PropertyValueFactory<>("_mprovince"));
				table_postalcode.setCellValueFactory(new PropertyValueFactory<>("_mpostalcode"));

				table.setItems(database);
			}
		}

		catch (SQLException e){ //When there is exception
			e.printStackTrace();
		}

		finally{
			DBConnection.closeConnection();
		}
	}
}