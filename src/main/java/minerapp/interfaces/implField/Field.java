package main.java.minerapp.interfaces.implField;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import main.java.minerapp.classes.canvas;
import main.java.minerapp.gui.Action;
import main.java.minerapp.gui.Elements;
import main.java.minerapp.gui.SingltonGroup;
import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.IField;

//реализация интерфейса для поля.
public class Field implements IField{
    ICell[][] arr;
    Canvas canvas;
    GraphicsContext gc;

    public Field(ICell[][] arr)
    {
        this.arr = arr;
        creatGraphicsElements();
        addGraphicsElements();
        redraw();
    }

    @Override
    public void redraw() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j].draw(gc, j, i);
            }
        }
    }

    @Override
    public void creatGraphicsElements() {

        canvas = new Elements().createCanvas();
        gc = canvas.getGraphicsContext2D();
    }


    @Override
    public void addGraphicsElements() {
        SingltonGroup.giveGroup().getChildren().add(canvas);
    }
}
