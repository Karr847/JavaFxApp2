import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("Episode");
        stage.setWidth(400);
        stage.setHeight(500);
        VBox parent=new VBox();
        Label label1=new Label("This is text label1");// child node
        Label label2=new Label("Another label");
        parent.getChildren().addAll(label1,label2);
        Scene scene1=new Scene(parent);
        stage.setScene(scene1);
        scene1.setCursor(Cursor.CROSSHAIR);
        stage.show();
    }

    public static void main(String[] args) {launch(args);

    }

}
