package main.java.minerapp.start;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import main.java.minerapp.classes.canvas;
import main.java.minerapp.interfaces.ICell;

//главный класс, для запуска программы
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //String address = "/fxml/main.fxml";
        //Parent root = FXMLLoader.load(getClass().getResource(address));
        Group root = new Group();

        /*
        Label label = new Label();
        Rectangle rec = new Rectangle(20,20,20,20);
        root.getChildren().add(rec);
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label.setText(event.getX() + " " + event.getY());
            }
        });
        Rectangle rec1 = new Rectangle(40,40,20,20);
        root.getChildren().add(rec1);
        root.getChildren().add(label);
        */

        canvas can = new canvas(10,10,20);
        ICell[][] arr = can.getArrayCell();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                Rectangle rec = new Rectangle(20,20,20*j, 20*i);
                rec.setFill(Color.TRANSPARENT);
                rec.setStroke(Color.BLACK);
                root.getChildren().add(rec);
            }
        }
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }






    public static void main(String[] args) {
        launch(args);
    }
}
