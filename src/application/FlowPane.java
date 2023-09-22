package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FlowPane extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        FlowPane fp1 = createFlowPane(Pos.BOTTOM_RIGHT);
        FlowPane fp2 = createFlowPane(Pos.BOTTOM_LEFT);
        FlowPane fp3 = createFlowPane(Pos.CENTER);
        HBox root = new HBox(fp1, fp2, fp3);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("FlowPane Alignment");
        stage.show();
    }
    private FlowPane createFlowPane(Pos alignment) {
        FlowPane fp = new FlowPane(5, 5);
        fp.setPrefSize(200, 100);
        fp.setAlignment(alignment);
        fp.getChildren().addAll(new Text(alignment.toString()),         
}
