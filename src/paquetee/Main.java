package paquetee;
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
		Text mensaje = new Text("Hola fx mensaje dentro la ventana");
		VBox raiz = new VBox();
		raiz.getChildren().add(mensaje);
		Scene escenario = new Scene(raiz, 300, 50);
		escena.setScene(escenario);
		escena.setTitle("TITLE: Hola Fx, mi primera escena");
		escena.show();

	}
}