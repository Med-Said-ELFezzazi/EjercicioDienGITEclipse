package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EjercicioObiwan extends Application{
    public static void main(String[] args) {
    	Application.launch(args);
    }
    public void start(Stage escenario){
        Label lblNombre = new Label("introduce el nombre :");
        TextField fldNombre = new TextField();
        Label mensaje = new Label();
        mensaje.setStyle("-fx-text-fill:blue");
        // Buttons
        Button btnAceptar = new Button("Aceptar");
        btnAceptar.setOnAction(e -> showDialog(escenario, NONE));
        Button btnSalir = new Button("Salir");
        // dale el button aceptar su funcionamiento
        btnAceptar.setOnAction(e ->{
            String nombre = fldNombre.getText();
            if (nombre == "Obi wan") {

            } else {
               mensaje.setText("Hola "+nombre); 
            }
        });
        //dale al button salir su funcionamiento
        btnSalir.setOnAction(e -> Platform.exit());
        // Creacion y asignacion del VBox y su contenedor
        VBox raiz = new VBox();
        raiz.getChildren().addAll(lblNombre, fldNombre, btnAceptar, btnSalir);

        private void showDialog(Window owner, Modality modality){
            Stage ...

        }





        // Parte final
        //creacion del scene
        Scene escena = new Scene(raiz, 450, 250);
        escenario.setScene(escena);
       // titulo y show el programar
        escenario.setTitle("Obi wan");
        escenario.show();



    }


}
