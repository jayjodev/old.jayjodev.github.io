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

	public void onUpdatePlayerClicked(ActionEvent event) throws IOException{ //Action when Update button is clicked
		AnchorPane pane = FXMLLoader.load(this.getClass().getResource("UpdatePlayer.fxml"));
		AnchorPane.setLeftAnchor(pane, 0.0);
		AnchorPane.setTopAnchor(pane, 0.0);
		AnchorPane.setRightAnchor(pane, 0.0);
		AnchorPane.setBottomAnchor(pane, 0.0);
		showPane.getChildren().setAll(pane);
	}

	public void onDisplayReportClicked(ActionEvent event) throws IOException{  //Action when Display button is clicked
		AnchorPane pane = FXMLLoader.load(this.getClass().getResource("Report.fxml"));
		AnchorPane.setLeftAnchor(pane, 0.0);
		AnchorPane.setTopAnchor(pane, 0.0);
		AnchorPane.setRightAnchor(pane, 0.0);
		AnchorPane.setBottomAnchor(pane, 0.0);
		showPane.getChildren().setAll(pane);
	}

	public void onCreateMatchClicked(ActionEvent event) throws IOException{  //Action when Insert game & player button is clicked
		AnchorPane pane = FXMLLoader.load(this.getClass().getResource("Game.fxml"));
		AnchorPane.setLeftAnchor(pane, 0.0);
		AnchorPane.setTopAnchor(pane, 0.0);
		AnchorPane.setRightAnchor(pane, 0.0);
		AnchorPane.setBottomAnchor(pane, 0.0);
		showPane.getChildren().setAll(pane);
	}

}
