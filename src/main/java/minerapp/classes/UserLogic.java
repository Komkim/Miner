package main.java.minerapp.classes;

import main.java.minerapp.interfaces.ICell;

//Возможные действия пользователя
public class UserLogic {
    private ICell[][] arrCell;

    public UserLogic(ICell[][] arrCell) {
        this.arrCell = arrCell;
    }

    //открыть клетку
    public void openCell(int x, int y)
    {
        arrCell[y][x].openCell();
    }

    //я думаю здесь мина
    public void putMine(int x , int y)
    {
        arrCell[y][x].thinkThatMine();
    }

    //неизвестная ячейка
    public void unknownCell(int x, int y)
    {
        arrCell[y][x].makeUnknown();
    }

}
