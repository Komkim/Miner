package main.java.minerapp.gui;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;

//класс для элементов гуя
public class Elements {
    public Label createLabel()
    {
        return new Label();
    }

    public Canvas createCanvas()
    {
        return new Canvas(600, 600);
    }
}
