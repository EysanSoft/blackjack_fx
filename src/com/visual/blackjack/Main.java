package com.visual.blackjack;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("vista/blackjackfx.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("vista/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Eysan´s Blackjack");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
