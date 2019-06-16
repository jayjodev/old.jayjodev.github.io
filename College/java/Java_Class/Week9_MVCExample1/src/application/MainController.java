package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

	@FXML private Button _btnAccept;
	@FXML private Button _btnReject;

	// this method gets (automatically) called when the application runs
	@FXML public void initialize(){

		// attach the accept button with the event handle object
		this._btnAccept.setOnAction(new AcceptHandler());
		this._btnReject.setOnAction(new RejectHandler());
	}

	private class AcceptHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
              onAcceptClicked();
		}
	}

	private class RejectHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
              onRejectClicked();
		}
	}

	public void onAcceptClicked(){
		System.out.println("Accept button is clicked.");
	}
	public void onRejectClicked(){
		System.out.println("Reject button is clicked.");
	}
}
