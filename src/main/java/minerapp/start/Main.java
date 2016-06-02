package main.java.minerapp.start;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.minerapp.classes.Miner;
import main.java.minerapp.gui.SingltonGroup;

//главный класс, для запуска программы
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        new Miner().Start(20, 20, 60);
        primaryStage.setTitle("Miner");
        primaryStage.setScene(new Scene(SingltonGroup.giveGroup(), Miner.WIDTH, Miner.HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
