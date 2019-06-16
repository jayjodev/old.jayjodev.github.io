package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	@FXML private Button _btnDisplay; // instance variable: Button for display
	@FXML private TextField _txtName; // instance variables: Text Field to get values
	@FXML private TextField _txtAddress;
	@FXML private TextField _txtProvince;
	@FXML private TextField _txtCity;
	@FXML private TextField _txtPostalCode;
	@FXML private TextField _txtPhoneNumber;
	@FXML private TextField _txtEmail;
	@FXML private TextArea _txtOutput;
	@FXML private CheckBox _checkStudentCouncil; // instance variables: Check Box to get values
	@FXML private CheckBox _checkVolunteerWork;
	@FXML private RadioButton _computerbutton;  // instance variables: Radio Button to set up ComboBox
	@FXML private RadioButton _businessbutton;
	@FXML private ComboBox<String> _selectionBox; //instance variable: ComboBox
	@FXML private ListView<String> _listViewBox; //instance variable: List View


	String[] computerCourse = {"Java", "C#", "ASP.NET"}; //set up computer science courses
	String[] businessCourse = {"Economics", "GNED500", "Marketing"};  //set up business science courses
	ObservableList<String> computer_Course = FXCollections.observableArrayList(computerCourse); // A list that enables listeners to track changes when they occur.
	ObservableList<String> business_Course = FXCollections.observableArrayList(businessCourse);

	@FXML public void onComputerbutton(ActionEvent e){ //when the user click computer Radio button, method will occur
		_selectionBox.getItems().clear(); //selection box will clean before show up computer course.
		_selectionBox.getItems().setAll(this.computer_Course);
		_listViewBox.getItems().clear(); //list View also clean when on Computer Radio button clicked
	}

	@FXML public void onBuinessbutton(ActionEvent e){
		_selectionBox.getItems().clear();
		_selectionBox.getItems().setAll(this.businessCourse);
		_listViewBox.getItems().clear();
	}

	@FXML public void onCourseselected(ActionEvent e){ //Action Event

		if (!_listViewBox.getItems().contains(_selectionBox.getValue()) && this._selectionBox.getValue() != null)
			// it will check the list view contains courses more than one and it is not null it will add the course of list view (Because of clear action)
			_listViewBox.getItems().add(this._selectionBox.getValue()); //
	}

	@FXML public void onDisplayClicked(ActionEvent e){

		_txtOutput.clear(); //When on Display Button is clicked, Text area should clean first

		String userName = _txtName.getText(); //get value from Name Text field
		String userAddress = _txtAddress.getText();
		String userProvince = _txtProvince.getText();
		String userCity = _txtCity.getText();
		String userPostalCode = _txtPostalCode.getText();
		String userPhoneNumber = _txtPhoneNumber.getText();
		String userEmail = _txtEmail.getText();
		String studentCouncil = ""; //Set empty value for check box
		String volunteerWork = "";

		if (_checkStudentCouncil.isSelected()) //If Student Council Check box is selected, write the "Student Council"
		{
			studentCouncil = "Student Council";
		}

		if (_checkVolunteerWork.isSelected()) //If Volunteer Work Check box is selected, write the "volunteer Work"
		{
			volunteerWork = "volunteer Work";
		}

		_txtOutput.setText( //Display all information to Text area
				"Name: " + userName
				+"\nAddress: " + userAddress
				+"\nProvince: " + userProvince
				+"\nCity: " + userCity
				+"\nPostal Code: "+ userPostalCode
				+"\nPhone Number: " + userPhoneNumber
				+"\nUser Email: " + userEmail
				+"\n" + "Your activities: " + studentCouncil +"||" + volunteerWork
				+"\n"+ "Your course: " + this._listViewBox.getItems()); // Display Listview Box information.
	}

}

