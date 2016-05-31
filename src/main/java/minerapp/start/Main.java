package main.java.minerapp.start;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.Group;
import main.java.minerapp.classes.Miner;
import main.java.minerapp.classes.canvas;
import main.java.minerapp.gui.Action;
import main.java.minerapp.gui.SingltonGroup;
import main.java.minerapp.interfaces.ICell;

//главный класс, для запуска программы
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //String address = "/fxml/main.fxml";
        //Parent root = FXMLLoader.load(getClass().getResource(address));
        new Miner().Start();
        primaryStage.setTitle("Miner");
        primaryStage.setScene(new Scene(SingltonGroup.giveGroup(), 600, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
