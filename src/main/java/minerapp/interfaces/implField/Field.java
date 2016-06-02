package main.java.minerapp.interfaces.implField;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import main.java.minerapp.classes.UserLogic;
import main.java.minerapp.gui.Action;
import main.java.minerapp.gui.Elements;
import main.java.minerapp.gui.SingltonGroup;
import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.IField;

//реализация интерфейса для поля.
public class Field implements IField {
    private ICell[][] arr;
    private Canvas canvas;
    private GraphicsContext gc;
    private Button buttonStart;
    private UserLogic userLogic;
    private int x;
    private int y;
    private int mine;
    private Action action;

    public Field(ICell[][] arr, UserLogic userLogic ,int x, int y, int mine) {
        this.arr = arr;
        this.userLogic = userLogic;
        this.x = x;
        this.y = y;
        this.mine = mine;

        action = new Action(userLogic);
        creatGraphicsElements();
        addGraphicsElements();
        addAction();
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

    private void creatGraphicsElements() {
        canvas = new Elements().createCanvas();
        gc = canvas.getGraphicsContext2D();
        buttonStart = new Elements().startButton();

    }

    @Override
    public void addAction() {
        action.mouseClicked(this, x, y);
        action.newGame(buttonStart,x, y, mine, gc);
    }

    private void addGraphicsElements() {
        SingltonGroup.giveGroup().getChildren().add(canvas);
        SingltonGroup.giveGroup().getChildren().add(buttonStart);
    }
}
