package main.java.minerapp.classes;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import main.java.minerapp.gui.Action;
import main.java.minerapp.gui.Elements;
import main.java.minerapp.gui.SingltonGroup;
import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.implField.Field;

//логика игры
public class Miner {
    public static int height;
    public static int width;

    Field field;

    public void Start(int x, int y, int mine) {
        Miner.height = y * 20 + 40;
        Miner.width = x * 20 + 40;
        field = new Field(y,x,mine);
    }
}
