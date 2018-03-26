package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppMain extends Application{

	public static void main(String[] args) {
		launch(args); // activates start stage method

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// load the fxml
				Parent root = FXMLLoader.load(getClass().getResource("GuiV2.fxml"));
				
				primaryStage.initStyle(StageStyle.UNDECORATED);  // hides window border
				
				
				primaryStage.setScene(new Scene (root));
				primaryStage.show();
		
	}

}
