package main.java.minerapp.interfaces.implicell;

import main.java.minerapp.interfaces.ICell;
import javafx.scene.shape.Rectangle;

//ячейка
public class Cell implements ICell{
    private boolean cellMine;
    private boolean cellUnknown=false;
    private boolean thinkMine = false;
    private boolean openCell = false;
    private int number;

    public Cell(boolean mine) {
        cellMine = mine;
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


