package main.java.minerapp.interfaces.implField;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import main.java.minerapp.classes.Miner;
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
    private Action action;

    public Field(ICell[][] arr, UserLogic userLogic) {
        this.arr = arr;
        this.userLogic = userLogic;


        action = new Action(userLogic);
        creatGraphicsElements();
        addGraphicsElements();
        addAction();
        redraw();
    }

    @Override
    public void redraw() {
        openCanvas();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j].draw(gc, j, i);
            }
        }

    }

    @Override
    public boolean gameOver() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].isOpenCell() && arr[i][j].isMine()) {
                    buttonStart.setText("Gave Over!!!");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void youWin() {
        if (checkOpenCell() == Miner.SIZE_CANVAS_Y * Miner.SIZE_CANVAS_X - Miner.NUMBER_MINE)
            buttonStart.setText("You Win!!!");
        if (checkThinkMineCell() == Miner.NUMBER_MINE) buttonStart.setText("You Win!!!");
    }

    //счетает количество открытых клеток(всего)
    private int checkOpenCell() {
        int countOpenCell = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].isOpenCell() && !arr[i][j].isMine()) {
                    countOpenCell++;

                }
            }
        }
        return countOpenCell;
    }
    //счетает количество клеток помеченных как мины
    private int checkThinkMineCell() {
        int countThinkMineCell = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].isOpenCell() && arr[i][j].isThinkMine() && arr[i][j].isMine()) {
                    countThinkMineCell++;

                }
            }
        }
        return countThinkMineCell;
    }

    //открывает все клетки, если случился gameOver
    private void openCanvas() {
        if (!gameOver()) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (!arr[i][j].isThinkMine() && !arr[i][j].isOpenCell()) arr[i][j].openCell();
                }
            }
        }
    }

    //создает графические элементы на поле
    private void creatGraphicsElements() {
        canvas = new Elements().createCanvas();
        gc = canvas.getGraphicsContext2D();
        buttonStart = new Elements().startButton();

    }

    //добавляет события на поле
    private void addAction() {
        action.mouseClicked(this);
        action.newGame(buttonStart, gc);
    }

    //добавляте графические элементы на поле
    private void addGraphicsElements() {
        SingltonGroup.giveGroup().getChildren().add(canvas);
        SingltonGroup.giveGroup().getChildren().add(buttonStart);
    }
}
