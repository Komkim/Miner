package main.java.minerapp.interfaces.implicell;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import main.java.minerapp.classes.StyleCell;
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

    public boolean isChecknotCkech() {return checkOnCkech;}

    public void setChecknotCkech(boolean checkOnCkech) {this.checkOnCkech = checkOnCkech;}

    @Override
    public void openCell() {this.openCell = true;}

    @Override
    public int getNumber() {return number;}

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
        new StyleCell(gc).crearCell(x, y);
        if(openCell)
        {
            new StyleCell(gc).openCell(x, y);
            if(number != 0)
            {
                if(number == 9) new StyleCell(gc).mine(x, y);
                else new StyleCell(gc).text(x,y,number);
            }
        }
        else if(isThinkMine())
        {
            new StyleCell(gc).thinkMine(x, y);
        }
        else if(isUnknownCell())
        {
            new StyleCell(gc).unknownCell(x,y);
        }
        else
        {
            new StyleCell(gc).defoultCell(x ,y);
        }
    }
}


