package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage escena) throws Exception {
		Text mensaje = new Text("Hola fx soy cuadro de msg");
		VBox raiz = new VBox();
		raiz.getChildren().add(mensaje);
		Scene escenario = new Scene(raiz,400, 50);
		escena.setScene(escenario);
		/*
		Button holaBtn = new Button("hola");
		Button adiosBtn = new Button("adios

	@Override
	public void start(Stage escena) th!");
		
		holaBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				mensaje.setText("Hola");
			
			}
		});
		adiosBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				mensaje.setText("Adios");
			}
		});*/
		VBox vbz_raiz = new VBox();
		
		
		escena.setTitle("Hola Fx, mi primera escena");
		escena.show();
		
	}
}