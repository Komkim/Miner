package main.java.minerapp.interfaces.implicell;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import main.java.minerapp.interfaces.ICell;
import javafx.scene.shape.Rectangle;

//ячейка
public class Cell implements ICell{
    private boolean cellMine;
    private boolean cellUnknown;
    private boolean thinkMine;
    private boolean openCell;
    private boolean checkOnCkech;
    private int number;

    public Cell() {
        cellMine = false;
        cellUnknown=false;
        thinkMine = false;
        openCell = false;
        checkOnCkech = false;
        number = 9;
    }

    public void setCellMine(boolean cellMine) {
        this.cellMine = cellMine;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOpenCell() {
        return openCell;
    }

    public boolean isCheckOnCkech() {
        return checkOnCkech;
    }

    public void setCheckOnCkech(boolean checkOnCkech) {
        this.checkOnCkech = checkOnCkech;
    }

    @Override
    public void openCell() {
        this.openCell = true;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public boolean isMine() {
        return cellMine;
    }

    @Override
    public boolean isUnknownCell() {
        return cellUnknown;
    }

    @Override
    public void makeUnknown() {
        cellUnknown = !cellUnknown;
    }

    @Override
    public void thinkThatMine() {
        thinkMine = !thinkMine;
    }

    @Override
    public boolean isThinkMine() {
        return thinkMine;
    }

    @Override
    public void draw(GraphicsContext gc, int x, int y) {
        //if(x %2 == 0 || y % 2 ==0) openCell();
        //openCell();
        gc.clearRect(20 + 20*x, 20 + 20*y, 20, 20);
        if(openCell)
        {
            gc.setFill(Color.BLACK);
            gc.strokeRoundRect(20 + 20*x, 20 + 20*y, 20, 20, 10, 10);
            if(number != 0) gc.fillText(String.valueOf(number),26.75 + 20*x, 33.5 + 20*y);
        }
        else
        {
            gc.setFill(Color.CHOCOLATE);
            gc.fillRoundRect(20 + 20*x, 20 + 20*y, 20, 20, 10, 10);
        }
    }
}


