package main.java.minerapp.gui;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import main.java.minerapp.classes.Miner;

//здесь можно определить стили для элементов гуя
public class Elements {
    public Label createLabel()
    {
        return new Label();
    }

    public Canvas createCanvas()
    {
        return new Canvas(Miner.width, Miner.height);
    }

    public Group createGroup(){return new Group();}
}
