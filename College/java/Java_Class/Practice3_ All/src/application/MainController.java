package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class MainController {
	@FXML private AnchorPane showPane; //Using AnchorPane style

	public Parent getMainScene(ActionEvent event) throws IOException{
		AnchorPane parent = FXMLLoader.load(this.getClass().getResource("Main.fxml"));
		return parent;
	}

	public void onCreateDataClicked(ActionEvent event) throws IOException{  //Action when Insert game & player button is clicked
		AnchorPane pane = FXMLLoader.load(this.getClass().getResource("save.fxml"));
		AnchorPane.setLeftAnchor(pane, 0.0);
		AnchorPane.setTopAnchor(pane, 0.0);
		AnchorPane.setRightAnchor(pane, 0.0);
		AnchorPane.setBottomAnchor(pane, 0.0);
		showPane.getChildren().setAll(pane);
	}

	public void onUpdateDataClicked(ActionEvent event) throws IOException{ //Action when Update button is clicked
		AnchorPane pane = FXMLLoader.load(this.getClass().getResource("UpdateTest.fxml"));
		AnchorPane.setLeftAnchor(pane, 0.0);
		AnchorPane.setTopAnchor(pane, 0.0);
		AnchorPane.setRightAnchor(pane, 0.0);
		AnchorPane.setBottomAnchor(pane, 0.0);
		showPane.getChildren().setAll(pane);
	}

	public void onDisplayDataClicked(ActionEvent event) throws IOException{  //Action when Display button is clicked
		AnchorPane pane = FXMLLoader.load(this.getClass().getResource("ReportTest.fxml"));
		AnchorPane.setLeftAnchor(pane, 0.0);
		AnchorPane.setTopAnchor(pane, 0.0);
		AnchorPane.setRightAnchor(pane, 0.0);
		AnchorPane.setBottomAnchor(pane, 0.0);
		showPane.getChildren().setAll(pane);
	}

}
