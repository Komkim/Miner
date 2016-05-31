package main.java.minerapp.classes;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import main.java.minerapp.gui.Action;
import main.java.minerapp.gui.Elements;
import main.java.minerapp.gui.SingltonGroup;
import main.java.minerapp.interfaces.ICell;

//логика игры
public class Miner {

    public void Start() {
        Group root = SingltonGroup.giveGroup();
        Label label = new Elements().createLabel();
        canvas can = new canvas(20, 20, 20);
        ICell[][] arr = can.getArrayCell();

        Canvas canv = new Elements().createCanvas();
        GraphicsContext gc = canv.getGraphicsContext2D();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j].draw(gc, j, i);
            }
        }
        new Action().mouseClicked(root, label);
        root.getChildren().add(label);
        root.getChildren().add(canv);
    }
}
