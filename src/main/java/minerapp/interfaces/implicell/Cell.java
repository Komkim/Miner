package main.java.minerapp.interfaces.implicell;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import main.java.minerapp.classes.StyleCell;
import main.java.minerapp.interfaces.ICell;
import javafx.scene.shape.Rectangle;

//ячейка
public class Cell implements ICell {
    private boolean cellMine;
    private boolean cellUnknown;
    private boolean thinkMine;
    private boolean openCell;
    private boolean checkOnCkech;
    private int number;

    public Cell() {
        cellMine = false;
        cellUnknown = false;
        thinkMine = false;
        openCell = false;
        checkOnCkech = false;
        number = 9;
    }

    @Override
    public boolean isOpenCell() {
        return openCell;
    }

    @Override
    public boolean isChecknotCkech() {
        return checkOnCkech;
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
    public boolean isThinkMine() {
        return thinkMine;
    }


    @Override
    public void setCellMine(boolean cellMine) {
        this.cellMine = cellMine;
    }

    @Override
    public void setChecknotCkech(boolean checkOnCkech) {
        this.checkOnCkech = checkOnCkech;
    }

    @Override
    public void openCell() {
        this.openCell = true;
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
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void draw(GraphicsContext gc, int x, int y) {
        StyleCell styleCell = new StyleCell(gc);
        styleCell.crearCell(x, y);
        if (openCell) {
            styleCell.openCell(x, y);
            if (number != 0) {
                if (isMine()) styleCell.mine(x, y);
                else styleCell.text(x, y, number);
            }
        } else if (isThinkMine()) {
            styleCell.thinkMine(x, y);
        } else if (isUnknownCell()) {
            styleCell.unknownCell(x, y);
        } else {
            styleCell.defoultCell(x, y);
        }
    }
}


