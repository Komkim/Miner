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
    canvas can;
    ICell[][] arr;
    Group root;
    Label label;
    Canvas canv;
    GraphicsContext gc;

    public Field(int y, int x, int mine)
    {
        can = new canvas(y, x, mine);
        arr = can.getArrayCell();
        creatGraphicsElements();
        addAction();
        addGraphicsElemnts();
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
        root = SingltonGroup.giveGroup();
        label = new Elements().createLabel();
        canv = new Elements().createCanvas();
        gc = canv.getGraphicsContext2D();
    }

    @Override
    public void addAction() {
        new Action().mouseClicked(root, label);
    }

    @Override
    public void addGraphicsElemnts() {
        root.getChildren().add(label);
        root.getChildren().add(canv);
    }
}
