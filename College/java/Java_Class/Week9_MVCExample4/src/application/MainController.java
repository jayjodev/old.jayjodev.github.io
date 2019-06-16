package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	@FXML private Button _btnAccept;
	@FXML private Button _btnReject;
	@FXML private TextArea _txtOutput;
	@FXML private Button _btnClear;
	@FXML private TextField _txtInput;
	@FXML private Button _btnSubmit;
	@FXML private Label _lblError;

	// this method gets (automatically) called when the application runs
	/*@FXML public void initialize(){




	}*/




	@FXML public void onAcceptClicked(ActionEvent e){
		_txtOutput.appendText("Accept button was clicked\n");
	}
	@FXML public void onRejectClicked(ActionEvent e){
		_txtOutput.appendText("Reject button was clicked\n");
	}

	@FXML public void onClearClicked(ActionEvent e){


		_txtOutput.clear();
	}

	@FXML public void onSubmitClicked(ActionEvent e){

		try{
		   int userValue = Integer.parseInt(_txtInput.getText());
		   _lblError.setText("");
		   _txtOutput.clear();
		   _txtOutput.setText(String.valueOf(++userValue));
		}
		catch(NumberFormatException ex){
             _lblError.setText("**You must enter an integer value");
		}

	}

}











