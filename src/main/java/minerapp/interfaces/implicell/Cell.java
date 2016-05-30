package main.java.minerapp.interfaces.implicell;

import main.java.minerapp.interfaces.ICell;

//ячейка
public class Cell implements ICell{
    private boolean cellMine;
    private boolean cellUnknown;

    public Cell() {

    }

    @Override
    public void draw() {

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
}
