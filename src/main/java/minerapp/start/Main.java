package main.java.minerapp.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;

//главный класс, для запуска программы
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //String address = "/fxml/main.fxml";
        //Parent root = FXMLLoader.load(getClass().getResource(address));
        Group root = new Group();
        root.getChildren().add(new Rectangle(20,20,20,20));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
