package application;


import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage escena) throws Exception {
		escena.setTitle("Hola Fx, mi primera escena!!!");
		escena.show();
		
	}
}