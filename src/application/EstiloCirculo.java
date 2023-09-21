package application;

import javax.swing.event.MouseInputAdapter;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EstiloCirculo extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage escenario) {
        // Instanciar los circulos 
        Circle circulo = new Circle(100, 100, 50);
        Circle circulo2 = new Circle(100, 100, 50);
        circulo.setFill(Color.BLUE);
        circulo2.setFill(Color.BLACK);

        Label mensaje = new Label();
        mensaje.setStyle("-fx-text-fill:green");
        // Create a MouseEvent handler
        EventHandler<MouseEvent> EventHandlerRaton = e -> 
            System.out.println("el event handler del raton se ha llamado");
            mensaje.setText("Acabas de hacer un click en el primer circulo ");
        // Creacion de mouse event  handler del segundo circulo
        EventHandler<MouseEvent> EventHandlerRaton2 = e -> 
            System.out.println("el event handler del raton se ha arrastarado");
            mensaje.setText("Acabas de hacer un click en el segundo circulo ");

        // mouse-clicked events 1
        circulo.addEventHandler(MouseEvent.MOUSE_CLICKED, EventHandlerRaton);
        // mouse clicked events 2 el circulo 2
        circulo2.addEventHandler(MouseEvent.MOUSE_DRAGGED, EventHandlerRaton2);

        HBox raiz = new HBox();
        raiz.getChildren().addAll(circulo, circulo2, mensaje);
        Scene escena = new Scene(raiz, 400, 300);
        escenario.setScene(escena);
        escenario.setTitle("Registrando los Event Handlers");
        escenario.show();
        escenario.sizeToScene(); 


        // eso es el codigo de la pagina 74 del los apuntes , funciona igual como el primero
          /*  Circle circle = new Circle(100, 100, 50);
            circle.setFill(Color.CORAL);
            HBox root = new HBox();
            root.getChildren().add(circle);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Using convenience event handler properties");
            stage.show();
            stage.sizeToScene();
            // Create a MouseEvent handler
            EventHandler<MouseEvent> eventHandler = e -> 
                System.out.println("Mouse event handler has been called.");
            // Register the handler using the setter method for
            // the onMouseCicked convenience event property
            circle.setOnMouseClicked(eventHandler); */
    }
}