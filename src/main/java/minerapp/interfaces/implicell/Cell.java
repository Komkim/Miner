package main.java.minerapp.interfaces.implicell;

import main.java.minerapp.interfaces.ICell;
import javafx.scene.shape.Rectangle;

//ячейка
public class Cell implements ICell{
    private boolean cellMine;
    private boolean cellUnknown;
    private boolean thinkMine;
    private boolean openCell;
    private int number;

    public Cell() {
        cellMine = false;
        cellUnknown=false;
        thinkMine = false;
        openCell = false;
        number = -1;
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

    @Override
    public void openCell() {
        this.openCell = !openCell;
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
    public void draw() {

    }
}


