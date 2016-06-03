package main.java.minerapp.gui;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import main.java.minerapp.classes.Miner;

//здесь можно определить стили для элементов гуя
public class Elements {
    public Label createLabel() {
        return new Label();
    }

    public Canvas createCanvas() {
        return new Canvas(Miner.WIDTH, Miner.HEIGHT);
    }

    public Group createGroup() {
        return new Group();
    }

    public Button startButton()
    {
        Button button = new Button();
        button.setPrefSize(100,30);
        button.setLayoutX(Miner.WIDTH/2 - 50);
        button.setLayoutY(10);
        return button;
    }

}
